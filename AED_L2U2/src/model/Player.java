package model;

public class Player {

	String nickname;
	Player siguiente;

	public Player(String nickname) {
		super();
		this.nickname = nickname;
		siguiente = null;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Player getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Player siguiente) {
		this.siguiente = siguiente;
	}

}