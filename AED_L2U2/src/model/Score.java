package model;

import java.io.Serializable;

public class Score implements Serializable{

	private Integer value;
	private Player player;
	private Score next;
	private Integer key;

	public Score(Integer value) {
		super();
		this.value = value;
		player = null;
		setNext(null);
		setKey(null);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Score getNext() {
		return next;
	}

	public void setNext(Score next) {
		this.next = next;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + player + ", " + value + ")";
	}
}
