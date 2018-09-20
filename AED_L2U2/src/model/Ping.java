package model;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Timer;

public class Ping {
	private String stateConnection;

	public Ping() {
		// TODO Auto-generated constructor stub
		stateConnection = "";
	}

	// Give a AWS ip address according to the region
	public String giveIpForRegion(String region) {
		String ip = "";
		switch (region) {
		case "Africa":
			// MUMBAI ADDRESS
			ip = "13.126.0.252";

			break;
		case "Asia":
			// ASIA PACIFIC ADDRESS
			ip = "13.112.63.251";

			break;
		case "Europe":
			// FRANKFURT ADDRESS
			ip = "18.194.0.252";

			break;

		case "North America":
			// NORTH CALIFORNIA ADDRESS
			ip = "13.56.63.251";

			break;

		case "South America":
			// NORTH VIRGINIA'S ADDRESS
			ip = "34.192.0.54";

			break;

		default:
			break;
		}

		return ip;
	}

	// Show if the connection is established
	public String connect(String ip) {
		InetAddress ping;

		try {
			ping = InetAddress.getByName(ip);

			if (ping.isReachable(6000)) {
				stateConnection = ip + " - address is rechable! \n" + "Time connection: "
						+ System.currentTimeMillis() / 1000.0f + " milliseconds";

			} else {
				stateConnection = ip
						+ " - address is unreable! \n + System.currentTimeMillis() / 1000.0f + \" milliseconds\"";

			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
		return stateConnection;
	}

	public String getStateConnection() {
		return stateConnection;
	}

	public void setStateConnection(String stateConnection) {
		this.stateConnection = stateConnection;
	}

}