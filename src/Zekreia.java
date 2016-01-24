import static java.lang.System.out;
import java.util.Random;

public class Zekreia {

	public static void main(String[] args) {
		// NOTES: пише се името и стойноста на герой 1, после герой 1 хвърля зар.След него се пише герой 2 по същия начин
		
		out.println("Добре дошли в бойната система на Зекрея!");
		out.println(" ");
		out.println("Напишете стойностите на двата героя в полетата долу и кликнете БИТКА!");
		out.println(" ");
		
		// hero1
		ZekreiaHeroOne heroOne = new ZekreiaHeroOne();
		heroOne.Hero1Name();
		heroOne.Hero1Ability();		
		
		// dice hero1
		
		out.println("tova e zar: " + heroOne.getDice1());
		out.println("tova e obsto: " + heroOne.getAbilityDice1());
		
		/* hero 2
		ZekreiaHeroTwo heroTwo = new ZekreiaHeroTwo();
		heroTwo.Hero2Name();
		heroTwo.Hero2Ability();
		*/
	
		/* dice hero2		
		Dice dice2 = new Dice();
		out.printf("%s хвърля зар: ", heroTwo.getName2());		
		out.println(dice.getDice2());
		*/
		
		// променлива dicePlusAbility 1 и 2 трябва да бъде променена и премахната!
		}
	
	}
		

