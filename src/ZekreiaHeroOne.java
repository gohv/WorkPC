import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class ZekreiaHeroOne {

	String hero1;
	int ability1;
	

	// Name
	public void Hero1Name() {

		Scanner heroName = new Scanner(System.in);
		out.print("Напишете името на първия герой: ");
		hero1 = heroName.nextLine();
	}

	// Ability
	public void Hero1Ability() {
		Scanner intAbility = new Scanner(System.in);
		out.printf("Напишете стойноста на %s: ", hero1);
		while (!intAbility.hasNextInt()) {
			out.print("Моля напишете число:");
			intAbility.nextLine();
		}
		ability1 = intAbility.nextInt();
	}
	// dice 1
	public int getDiceAbility1(){
		int dice1 = new Random().nextInt(20) + 1;
		int abilityDice1 = dice1 + ability1;
		return abilityDice1;
	}
		
		
	// geters
	public String getName() {
		return hero1;
	}

	public int getAbility1() {
		return ability1;
	}
	

	
	

	}
	
