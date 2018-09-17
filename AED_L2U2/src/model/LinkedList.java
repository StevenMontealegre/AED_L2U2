package model;

public class LinkedList {

	private Score first;

	public LinkedList(Score first) {
		super();
		this.first = first;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void addElement(Score d) {
		if (isEmpty()) {
			first = d;
		} else {
			Score actual = first;
			Score before = null;
			while (actual.getNext() != null) {
				before = actual;
				actual = actual.getNext();
			}
			before.setNext(d);
		}
	}

	public Score getFirst() {
		return first;
	}

	public void setFirst(Score first) {
		this.first = first;
	}

}