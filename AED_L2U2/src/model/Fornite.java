package model;

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

	public void newGame(Player p) {
		int sco = (int) (Math.random() * 1500) + 1;
		Score s = new Score(500, p);
		hashTable.hash(s.getValue());
		hashTable.insert(s);

	}

	public Score findingPlayer(Score s) {
		return hashTable.rechieve(s);
	}
}
