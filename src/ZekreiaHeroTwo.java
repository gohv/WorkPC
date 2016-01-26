import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class ZekreiaHeroTwo {

	String hero2;
	int ability2;
// Name
	public void Hero2Name() {

		Scanner heroName = new Scanner(System.in);
		out.print("Напишете името на втория герой: ");
		hero2 = heroName.nextLine();
	}

	// Ability
	public void Hero2Ability() {
		Scanner inputAbility = new Scanner(System.in);
		out.printf("Напишете стойноста на %s: ", hero2);
		while (!inputAbility.hasNextInt()) {
			out.print("Моля напишете число:");
			inputAbility.nextLine();
		}		
		ability2 = inputAbility.nextInt();
		diceAbility = dice + ability2;		
	}
	// dice 2
		int dice = new Random().nextInt(20) + 1;
		int diceAbility = dice + ability2;
		public void diceRoll(){
			out.println(getName2() + " хвърля зар: " + getDice());
		}
		
	// geters
	public String getName2() {
		return hero2;
	}
	public int getAbility2(){
		return ability2;
	}
	public int getDice() {
		return dice;
	}
	public void getDiceAbility() {
		out.println("Общата стойност на "+ hero2 + " e: " + diceAbility);
	}
		
}
