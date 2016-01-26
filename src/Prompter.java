import java.util.Scanner;

public class Prompter {
	private Game mGame;

	public Prompter(Game game) {
		mGame = game;
	}

	public void play() {
		while (mGame.getRamainingTries() > 0) {
			displayProgress();
			promptForGuess();
		}
	}

	public boolean promptForGuess() {
		Scanner input = new Scanner(System.in);
		boolean isHit = false;
		boolean isValidGuess = false;
		while (!isValidGuess) {
			String guessAsString;
			System.out.print("Guess the word: ");
			guessAsString = input.nextLine();
			char guess = guessAsString.charAt(0);
			try {
				isHit = mGame.applyGuess(guess);
				isValidGuess = true;
			} catch (IllegalArgumentException iae) {
				System.out.printf("%s  Please try again.\n", iae.getMessage());
			}
		}

		return isHit;
	}

	public void displayProgress() {
		System.out.printf("Remaining tries %d: %s\n", mGame.getRamainingTries(), mGame.getCurrentProgress());
	}
}