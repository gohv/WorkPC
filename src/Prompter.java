import java.util.Scanner;

public class Prompter {
	private Game mGame;

	public Prompter(Game game) {
		mGame = game;
	}

	public boolean promptForGuess() {
		Scanner input = new Scanner(System.in);
		String guessAsString;
		System.out.println("Napishi kur: ");
		guessAsString = input.nextLine();
		char guess = guessAsString.charAt(0);
		return mGame.applyGuess(guess);

	}

}