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
		Scanner intAbility = new Scanner(System.in);
		out.printf("�������� ��������� �� %s: ", hero2);
		while (!intAbility.hasNextInt()) {
			out.print("���� �������� �����:");
			intAbility.nextLine();
		}		
		ability2 = intAbility.nextInt();
	}
	// Outline
	public void Outline2(){
		out.println(hero2 + " ��� " + ability2 + " ��������" );
	}
		
		
}
