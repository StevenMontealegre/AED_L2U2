package model;

public class Score {
	
	private Integer value;
	private Player player;
	private Score next;

	public Score(Integer value, Player player) {
		super();
		this.value = value;
		this.player = player;
		setNext(null);
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

}
