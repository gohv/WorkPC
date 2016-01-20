import static java.lang.System.out;
import java.util.Random;

public class Zekreia {

	public static void main(String[] args) {
		
		
		out.println("Добре дошли в бойната система на Зекрея!");
		out.println(" ");
		out.println("Напишете стойностите на двата героя в полетата долу и кликнете БИТКА!");
		out.println(" ");
		
		// hero1
		ZekreiaHeroOne heroOne = new ZekreiaHeroOne();
		heroOne.Hero1Name();
		heroOne.Hero1Ability();
		
		/* hero 2
		ZekreiaHeroTwo heroTwo = new ZekreiaHeroTwo();
		heroTwo.Hero2Name();
		heroTwo.Hero2Ability();
		*/
		
		// dice hero1
		
		out.printf("%s хвърля зар: ", heroOne.getName());		
		// out.println(heroOne.getDice());
		out.println(heroOne.getAbility1());
		out.println("OBSTO " + heroOne.getDiceAbility1());
		
	
		/* dice hero2		
		Dice dice2 = new Dice();
		out.printf("%s хвърля зар: ", heroTwo.getName2());		
		out.println(dice.getDice2());
		*/
		
		// променлива dicePlusAbility 1 и 2 трябва да бъде променена и премахната!
		}
	
	}
		

