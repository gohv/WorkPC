import static java.lang.System.out;
import java.util.Random;

public class Dice {
	// dice 1
	int dice1 = new Random().nextInt(20) + 1;	
	public int getDice1(){
		return dice1;
	}
	// dice 2
	int dice2 = new Random().nextInt(20) + 1;			
			public int getDice2(){
		return dice2;		
	}
			
	
}
