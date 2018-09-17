package model;

public class Hashtable {
	public final static Integer size = 199;
	private Score[] table;

	public Hashtable() {
		// TODO Auto-generated constructor stub
		setTable(new Score[size]);

	}

	public Integer hash(Integer k) {
		Integer key = 0;
		key = (k & 0x7fffffff) % size;

		return key;
	}

	public void insert(Score s) {
		Integer value = s.getValue();
		LinkedList l = new LinkedList(s);
		if (l.isEmpty()) {
			table[hash(value)] = s;
		} else {
			l.addElement(s);
		}

	}

	public Player rechieve(Integer score) {
		return null;
	}

	public void delete(Integer score) {

	}

	public Score[] getTable() {
		return table;
	}

	public void setTable(Score[] table) {
		this.table = table;
	}

}
