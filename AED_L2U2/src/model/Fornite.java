package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fornite {

	private Stack stack;
	private Hashtable hashTable;

	public Fornite() {
		stack = new Stack<>();
		hashTable = new Hashtable();

	}

	public void createWeaponStack() {
		stack = new Stack<Weapon>();
		Weapon axe = new Weapon(0, "axe");

	}
	//Create a new Score using a text file. 

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
	
	//look for a Score entered by parameter

	public Score findingPlayer(Score s) {

		int key = hashTable.hash(s.getValue());
		Score sco = hashTable.getTable()[key];
		return sco;
	}
}
