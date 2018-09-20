package model;

// This is a alternative data structure to counteract collisions
public class LinkedList {

	private Score first;

	public LinkedList() {

		first = null;
	}

	public LinkedList(Score first) {
		this.first = first;

	}

	public boolean isEmpty() {
		return first == null;
	}
// Add elements to the list
	public void addElement(Score s) {

		s.setNext(first);
		first = s;

	}
// look for elements into the list
	public Score retrieve(Integer score) {

		Score aux = first;
		Score element = null;
		boolean found = false;
		while (aux != null && found != true) {
			if (score == aux.getValue()) {
				element = aux;
				found = true;
			} else {
				aux = aux.getNext();
			}
		}

		return element;

	}

	public Score getFirst() {
		return first;
	}

	public void setFirst(Score first) {
		this.first = first;
	}

}