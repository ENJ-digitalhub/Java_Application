import java.util.Scanner;

public class HypotenusCalculations{
	public static double hypotenuse (double opposite, double adjacent){
		double hypotenuse = Math.sqrt(Math.pow(opposite,2)+Math.pow(adjacent,2));
		return hypotenuse;
	}
	public static void main (String[] args){
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Input opposite: ");
		double opposite = read.nextDouble();
		System.out.print("Input adjacent: ");
		double adjacent = read.nextDouble();
		System.out.println(hypotenuse(opposite,adjacent));
	}
}