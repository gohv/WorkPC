import static java.lang.System.out;
import java.util.Scanner;

public class ZekreiaHeroOne {

	String hero1;
	int ability1;

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
	public void Outline1(){
		out.println(hero1 + " има " + ability1 + " стойност" );
	}

}
