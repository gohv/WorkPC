public class Hangman {

	public static void main(String[] args) {
		Game game = new Game("telefon");
		Prompter prompter = new Prompter(game);
		prompter.play();
	}

}