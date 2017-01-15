import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
/*****************************************************************************
* Guess what random number the computer is thinking 
*
* Created by Marcos on 15/01/2017
*****************************************************************************/
public class NumberGuess {
	public static void main(String[] args){
		
		Random rn = new Random();
		int solution = rn.nextInt(101);	
		String userInput = "";

		while(1 == 1){
			System.out.print("What number am I thinking? ");
			Scanner reader = new Scanner(System.in);
			userInput = reader.next();
			if(userInput.equals("quit")){
				break;
			}
			int userGuess = Integer.parseInt(userInput);
			int absUserGuess = Math.abs(userGuess - solution);
			if(userGuess == solution){
				System.out.println("(: CONGRATULATIONS!!! :')");
				break;
			} else if(userGuess < solution && absUserGuess > 15){ 
				System.out.println("COLD, you need to go much higher!!");
			} else if(userGuess < solution && absUserGuess < 15){
				System.out.println("HOT, you need to go a bit higher :)");
			} else if(userGuess > solution && absUserGuess > 15){
				System.out.println("COLD, not so high!!");
			} else if(userGuess > solution && absUserGuess < 15){
				System.out.println("HOT, you went only a bit too high ;)");
			}
		}
	}
}