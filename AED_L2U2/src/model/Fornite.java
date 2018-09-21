package model;

import java.util.ArrayList;

import view.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fornite<T> implements Serializable {

	private Main main;
	private Stack stack;
	private Queue<String> weaponsQueue;
	private Hashtable hashTable;
	private Ping ping;

	public Fornite(Main main) {
		this.main = main;
		hashTable = new Hashtable();
		ping = new Ping();

	}

	public Hashtable load() throws ClassNotFoundException, FileNotFoundException, IOException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("files/principal.dat")));
		Hashtable ms = (Hashtable) in.readObject();
		in.close();
		return ms;
	}

	public void save() throws FileNotFoundException, IOException {
		System.out.println("Fortnite ");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("files/principal.dat")));
		out.writeObject(hashTable);
		out.close();
	}

	public String getNextWeapon(int q) {
		weaponsQueue.dequeue();
		String urlImage = (String) weaponsQueue.last();
		if (q == 1) {
			weaponsQueue.enqueue(urlImage);
		}
		return urlImage;
	}

	public void createWeaponStack() {
		getWeapons();
		stack = new Stack();
		int a = stack.size();
		stack.push(new Weapon("ax.png"));
	}

	public String[] useWeapon() {
		stack.top().useWeapon();
		if (stack.top().getState() == 0 || stack.top().getState() < 0) {
			stack.pop();
		}

		String[] data = new String[4];
		data[0] = stack.top().getName();
		data[1] = stack.top().getColor();
		data[2] = stack.top().getState() + "";
		return data;
	}

	public String[] showWeaponsNames() {
		String[] names = new String[stack.size()];
		ArrayList<Weapon> s = stack.getStack();
		for (int i = 0; i < s.size(); i++) {

			names[i] = s.get(i).getStackName();
		}
		return names;

	}

	public String catchWeapon() {
		String weapon = weaponsQueue.dequeue();
		stack.push(new Weapon(weapon));
		return weapon;
	}

	public void getWeapons() {

		weaponsQueue = new Queue<String>();

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("files/Weapons.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {

				weaponsQueue.enqueue(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Reading exception");
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void newGame() {

		System.out.println("NEW GAME");

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("files/Users_Database.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {

				String[] data = linea.split(",");
				String player = data[0];
				String sc = data[1];
				String region = data[2];
				String platform = data[3];
				Integer score = Integer.parseInt(sc);
				Score s = new Score(score);
				Player p = new Player(player, region, platform);
				s.setPlayer(p);
				// hashTable.hash(score);
				hashTable.insert2(s);
				ping.connect(ping.giveIpForRegion(region));

			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Reading exception");
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("FINISHED");
	}

	public ArrayList<String> getScores(int slot) {

		return hashTable.getScores(slot);
	}

	// look for a Score entered by parameter
	public Score findingPlayer(Score s) {

		int key = hashTable.hash(s.getValue());
		Score sco = hashTable.getTable()[key];
		return sco;
	}

//restrict the number of platforms
	public void generateSurge(Score sco, Score[] scores) {
		scores = new Score[100];
		int int1 = sco.getValue() - 50;
		int int2 = sco.getValue() + 50;
		int j = int1;
		int i = 0;
		int p1, p2, p3, p4;
		p1 = p2 = p3 = p4 = 0;

		while (j < int2) {

			Score sc = hashTable.getTable()[hashTable.hash(j)];
			switch (sc.getPlayer().getPlataform()) {
			case "Mobile":
				p1++;
				break;
			case "PC":
				p2++;
				break;
			case "PS4":
				p3++;
				break;
			case "xboxOne":
				p4++;
				break;
			default:
				break;
			}
			if (p1 <= 25) {
				scores[i] = sc;
			}
			if (p2 <= 25) {
				scores[i] = sc;
			}
			if (p3 <= 25) {
				scores[i] = sc;
			}
			if (p4 <= 25) {
				scores[i] = sc;
			}

			j++;
			i++;
		}

	}
}
