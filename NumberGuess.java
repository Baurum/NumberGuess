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
		System.out.println("What is your name? ");
		String name = "";
		Scanner reader = new Scanner(System.in);
		name = reader.next(); 
		int score = 100;
		System.out.	println("Initial Score: " + score);

		while(1 == 1){
			System.out.print("What number am I thinking " + name +" ? ");
			userInput = reader.next();
			if(userInput.equals("quit")){
				break;
			}
			int userGuess = Integer.parseInt(userInput);
			int absUserGuess = Math.abs(userGuess - solution);
			if(userGuess == solution){
				System.out.println("(: CONGRATULATIONS " + name +" :')");

				System.out.println("Your Score is: " + score);
				break;
			} else if(userGuess < solution && absUserGuess > 15){ 
				score = score - 10;
				System.out.println("COLD, you need to go much higher!!");
			} else if(userGuess < solution && absUserGuess < 15){
				score = score - 5;
				System.out.println("HOT, you need to go a bit higher :)");
			} else if(userGuess > solution && absUserGuess >= 15){
				score -=5;
				System.out.println("COLD, not so high!!");
			} else if(userGuess > solution && absUserGuess < 15){
				score -=10;
				System.out.println("HOT, you went only a bit too high ;)");
			}
			if(score <= 0){
				System.out.println("You're so bad in this game, Bye " + name);
				break;
			}

		}
	}
}