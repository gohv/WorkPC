public class Hangman {

	public static void main(String[] args) {
		Game game = new Game("Treehouse");
		Prompter prompter = new Prompter(game);
		boolean isHit = prompter.promptForGuess();
		if (isHit) {
			System.out.println("We got a hit");
		} else {
			System.out.println("Thats a miss!");
		}

	}

}