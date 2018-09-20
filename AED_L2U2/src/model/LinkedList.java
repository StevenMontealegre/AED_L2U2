package model;

import java.io.Serializable;
import java.util.ArrayList;

// This is a alternative data structure to counteract collisions
public class LinkedList implements Serializable{

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

	public ArrayList<Score> getScores()
	{
		Score actual = first;
		ArrayList<Score> list = new ArrayList<Score>();
		if( first == null)
		{
			return null;
		}
		else 
		{
			while(actual != null)
			{
				list.add(actual);
				actual = actual.getNext();
			}
			return list;
		}
		
	}
	
	
	public Score getFirst() {
		return first;
	}

	public void setFirst(Score first) {
		this.first = first;
	}

}