import java.util.Random;
public class MiniGame{
	public static void main(String[] args){
		
		Random rn = new Random();
		int solution = rn.nextInt(101);	
		System.out.println("" + solution);
	}

}