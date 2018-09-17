package model;

public class Hashtable {
	public final static Integer size = 199;
	private Score[] table;
	private int numElements;

	public Hashtable() {
		// TODO Auto-generated constructor stub
		setTable(new Score[size]);
		setNumElements(0);

	}

	public Integer hash(Integer k) {
		Integer key = 0;
		key = (k & 0x7fffffff) % size;

		return key;
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
			l.addElement(s);
			s.setKey(hash);
			numElements++;
			System.out.println(numElements);

		}

	}

	public Score rechieve(Score s) {
		Integer key = s.getKey();
		Score haveFound = null;
		if (table[key].getNext() != null) {
			LinkedList l = new LinkedList(table[key]);
			haveFound = l.retrieve(s.getValue());
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
