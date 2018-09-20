package model;

import java.util.ArrayList;

public class Hashtable {
	public final static Integer size = 199;
	private Score[] table;
	private int numElements;
	private int collisionsNumber;

	private LinkedList table2[];
	
	
	
	public Hashtable() {
		table2 = new LinkedList[size];
		setTable(new Score[size]);
		setNumElements(0);
		setCollisionsNumber(0);

	}

	// Its the hash function.
	public Integer hash(Integer k) {
		Integer key = 0;
		// I used this format because its another way for represent absolut value; Its
		// most faster to compute
		key = (k & 0x7fffffff) % size;

		return key;
	}
	// Insert a value in the linkedlist when a collision is ocurred

	
	//JHAJHAASGVEDHD 
	public void insert2(Score s)
	{
		Integer value = s.getValue();
		Integer key = hash(value);
		if(table2[key] == null)
		{
			System.out.println(key+"");
			table2[key] = new LinkedList();
			table2[key].setFirst(s);
		}
		else 
		{
			table2[key].addElement(s);
		}
	}
	
	
	public void insert(Score s) {
		Integer value = s.getValue();
		Integer hash = hash(value);
		LinkedList l = new LinkedList();
		if (table[hash] == null) {
			table[hash] = s;
			s.setKey(hash);
			numElements++;
			System.out.println(numElements);
		} else {
			collisionsNumber++;
			l.addElement(s);
			s.setKey(hash);
			numElements++;
			System.out.println(numElements);
		}
	}
	// look for a element in the linkedin

	public Score rechieve(Integer key, Integer value) {
		Score haveFound = null;
		if (table[key].getNext() != null) {
			LinkedList l = new LinkedList(table[key]);
			haveFound = l.retrieve(value);
		} else {
			haveFound = table[key];
		}
		return haveFound;
	}

	public void delete(Integer score) {

	}

	public Score[] getTable() {
		return table;
	}

	public void setTable(Score[] table) {
		this.table = table;
	}

	public int getNumElements() {
		return numElements;
	}

	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}

	public int getCollisionsNumber() {
		return collisionsNumber;
	}

	public void setCollisionsNumber(int collisionsNumber) {
		this.collisionsNumber = collisionsNumber;
	}
	
	public ArrayList<String> getScores(int slot)
	{
		ArrayList<String> scores = new ArrayList<>();
		Score actual = table2[slot].getFirst();
		while(actual!= null)
		{
			scores.add(actual.toString() +"");
			actual = actual.getNext();
		}
		return scores;
	}

}
