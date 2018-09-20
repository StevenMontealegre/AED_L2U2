package model;

public class Execute {
	public static void main(String[] args) {

		Fornite f = new Fornite();
		f.newGame();
		Score s = new Score(230);
		Score s1 = new Score(470);
		System.out.println(f.findingPlayer(s));
		System.out.println(f.findingPlayer(s1));

	}

}
