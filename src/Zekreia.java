import static java.lang.System.out;
import java.util.Random;

public class Zekreia {

	public static void main(String[] args) {
		out.println("Zekreia Start");
		// hero1
		ZekreiaHeroOne heroOne = new ZekreiaHeroOne();
		heroOne.Hero1Name();
		heroOne.Hero1Ability();
		
		// hero 2
		ZekreiaHeroTwo heroTwo = new ZekreiaHeroTwo();
		heroTwo.Hero2Name();
		heroTwo.Hero2Ability();
		
		// dice hero1
		Dice dice = new Dice();
		out.printf("%s хвърля зар: ", heroOne.getName());		
		out.println(dice.getDice1());
		int kur = heroOne.getAbility1() + dice.getDice1();
		out.println("Общо: " + kur);
	}

}
