package model;

public class Hashtable {
	public final static Integer size = 3;
	private Score[] table;
	private int numElements;

	public Hashtable() {
		// TODO Auto-generated constructor stub
		setTable(new Score[size]);
		setNumElements(0);

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
			l.addElement(s);
			s.setKey(hash);
			numElements++;
			System.out.println(numElements);

		}

	}
	// look for a element in the linkedlist

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

}
