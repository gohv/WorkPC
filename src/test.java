import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner inputAbility = new Scanner(System.in);
		out.printf("Напишете стойноста: ");
		while (!inputAbility.hasNextInt()) {
			out.print("Моля напишете число:");
			inputAbility.nextLine();
		}
		int ability1 = inputAbility.nextInt();
		
		int dice1 = new Random().nextInt(20) + 1;
		
		int diceAbility = dice1 + ability1;
		out.println(dice1);
		out.println(diceAbility);
	}

}
