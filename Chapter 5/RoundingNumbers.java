import java.util.Scanner;

public class RoundingNumbers{
	public static void main(String[] args){
		
		Scanner read = new Scanner (System.in);
		
		double x = 1;
		while (x>0){
			System.out.print("Input value(-1 to end): ");
			x = read.nextDouble();
			if (x == -1){
				break;
			}
			double y = Math.floor(x+0.5);
			System.out.println("Original: "+x+"\tRounded: "+y);
		}
	}
}