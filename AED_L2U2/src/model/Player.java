package model;

public class Player {

	String nickname;
	Player siguiente;
	String region;
	Ping ping;

	public Player(String nickname, String region) {
		super();
		this.nickname = nickname;
		this.region = region;
		siguiente = null;
		ping = new Ping();
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nickname + " " + ping.getStateConnection();
	}

}