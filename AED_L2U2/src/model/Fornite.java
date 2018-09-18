package model;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fornite<T> {

	private Stack stack;
	private Queue weaponsQueue;
	private Hashtable hashTable;

	public Fornite() {
		hashTable = new Hashtable();

	}
	
	public String getNextWeapon()
	{
		String urlImage = (String) weaponsQueue.dequeue();
		return urlImage;
	}
	
	
	public void useWeapon()
	{
		stack.top().useWeapon();
	}
	
	public void createWeaponStack()
	{
		getWeapons();
		stack = new Stack();
		System.out.println("Stack to create");
		int a = stack.size();
		stack.push(new Weapon("abc", "Gray"));
		System.out.println("1 " +a);
		
		System.out.println("2 "+stack.size());
		
		
	}
	
	
	public String[] showWeaponsNames()
	{
		stack = new Stack<>();

		String[] names = new String[stack.size()];
		ArrayList<Weapon> s = stack.getStack();
		for(int i = 0; i<s.size();i++)
		{
			
			names[i] = s.get(i).getName();
			System.out.println(names[i]);	
		}
		return names;

	}

	
	
	
	public void getWeapons()
	{
		
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
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				Integer score = Integer.parseInt(sc);
				Score s = new Score(score);
				Player p = new Player(player);
				s.setPlayer(p);
				hashTable.hash(score);
				hashTable.insert(s);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public Score findingPlayer(Score s) {
		Integer value = s.getValue();
		int key = hashTable.hash(s.getValue());
		return hashTable.rechieve(key, value);
	}
}
