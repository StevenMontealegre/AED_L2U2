package model;

import java.util.ArrayList;

import view.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fornite<T> {

	
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
				Integer score = Integer.parseInt(sc);
				Score s = new Score(score);
				Player p = new Player(player, region);
				ping.connect(ping.giveIpForRegion(region));
				s.setPlayer(p);
				//hashTable.hash(score);
				hashTable.insert2(s);

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
	
	
	public ArrayList<String> getScores(int slot)
	{
		
		return hashTable.getScores(slot);
	}
	
	
	// look for a Score entered by parameter
	public Score findingPlayer(Score s) {

		int key = hashTable.hash(s.getValue());
		Score sco = hashTable.getTable()[key];
		return sco;
	}
}
