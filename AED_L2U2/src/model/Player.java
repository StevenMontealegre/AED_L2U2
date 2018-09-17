package model;

public class Player {

	String nickname, ip;
	int life;
	Player siguiente;

	public Player(String nickname, String ip, int life) {
		super();
		this.nickname = nickname;
		this.ip = ip;
		this.life = life;
		siguiente = null;
	}


	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public Player getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Player siguiente) {
		this.siguiente = siguiente;
	}

}