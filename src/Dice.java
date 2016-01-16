import static java.lang.System.out;
import java.util.Random;

public class Dice {
	int dice1 = new Random().nextInt(20) + 1;	
	public int getDice1(){
		return dice1;
	}
}
