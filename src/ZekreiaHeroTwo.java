import static java.lang.System.out;
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
	}
	// geters
	public String getName2() {
		return hero2;
	}
	public int getAbility2(){
		return ability2;
	}
	
		
}
