package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Fornite;
import model.Hashtable;
import model.LinkedList;
import model.Ping;
import model.Player;
import model.Queue;
import model.Score;
import model.Stack;
import model.Weapon;

class ForniteTests {
	private Fornite fornite;
	private Player player;
	private Hashtable hash;
	private Ping ping;
	private LinkedList list;
	private Stack<Weapon> stack;
	private Queue<String> queue;

	@Test
	public void testInsert() {
		hash = new Hashtable();
		list = new LinkedList();
		Score sco1 = new Score(200);
		Score sco2 = new Score(400);
		sco1.setKey(100);
		Player p1 = new Player("Killer", "Asia", "PS4");
		sco1.setPlayer(p1);
		sco2.setKey(100);
		Player p2 = new Player("Miller", "Africa", "PC");
		sco2.setPlayer(p2);
		sco1.setValue(200);
		sco2.setValue(400);
		
		hash.insert(sco1);
		hash.insert(sco2);
		assertEquals(2, hash.getNumElements());

	}

}
