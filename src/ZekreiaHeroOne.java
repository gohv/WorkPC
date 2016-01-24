import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class ZekreiaHeroOne {

	public String hero1;
	public int ability1;
	public int abilityDice1;

	// Name
	public void Hero1Name() {

		Scanner heroName = new Scanner(System.in);
		out.print("Напишете името на първия герой: ");
		hero1 = heroName.nextLine();
	}

	// Ability
	public void Hero1Ability() {
		Scanner inputAbility = new Scanner(System.in);
		out.printf("Напишете стойноста на %s: ", hero1);
		while (!inputAbility.hasNextInt()) {
			out.print("Моля напишете число:");
			inputAbility.nextLine();
		}

	}

	// dice 1

	// geters
	public String getName() {
		return hero1;
	}

	public int getAbility1() {
		return ability1;
	}

	int dice = new Random().nextInt(20) + 1;

	public int getAbilityDice1() {

		return abilityDice1 + dice;
	}
	public int getDice1(){
		return dice;
	}

}
