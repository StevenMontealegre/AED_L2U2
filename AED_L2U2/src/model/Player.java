package model;

import java.io.Serializable;

public class Player implements Serializable {

	String nickname;
	Player siguiente;
	String region;
	Ping ping;
	String plataform;

	public Player(String nickname, String region, String plataform) {
		super();
		this.nickname = nickname;
		this.region = region;
		siguiente = null;
		ping = new Ping();
		this.plataform = plataform;
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

	public Ping getPing() {
		return ping;
	}

	public void setPing(Ping ping) {
		this.ping = ping;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nickname + " " + ping.getStateConnection();
	}

}