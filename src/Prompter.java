import java.util.Scanner;

public class Prompter {
	private Game mGame;

	public Prompter(Game game) {
		mGame = game;
	}
	
	public void play(){
		while(mGame.getRamainingTries() > 0){
			displayProgress();
			promptForGuess();
		}
	}
	
	public boolean promptForGuess() {
		Scanner input = new Scanner(System.in);
		String guessAsString;
		System.out.print("Guess the word: ");
		guessAsString = input.nextLine();
		char guess = guessAsString.charAt(0);
		return mGame.applyGuess(guess);
	}
	public void displayProgress(){
	System.out.printf("Remaining tries %d: %s\n", 
			mGame.getRamainingTries(),
			mGame.getCurrentProgress());
}
}