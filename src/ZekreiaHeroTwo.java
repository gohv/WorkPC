import static java.lang.System.out;
import java.util.Scanner;

public class ZekreiaHeroTwo {

	String hero2;
	int ability2;
// Name
	public void Hero2Name() {

		Scanner heroName = new Scanner(System.in);
		out.print("�������� ����� �� ������ �����: ");
		hero2 = heroName.nextLine();
	}

	// Ability
	public void Hero2Ability() {
		Scanner inputAbility = new Scanner(System.in);
		out.printf("�������� ��������� �� %s: ", hero2);
		while (!inputAbility.hasNextInt()) {
			out.print("���� �������� �����:");
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
