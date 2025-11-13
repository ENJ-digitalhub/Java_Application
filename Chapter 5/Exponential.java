import java.util.Scanner;

public class Exponential{
	public static void integerPower(int base,int exponent){
		int result = 1;
		for (int i = 1; i <= exponent; i++){
			result*=base;
		}
		System.out.println("Exponential: "+result);
	}
	public static void main (String[] args){
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Input base: ");
		int base = read.nextInt();
		System.out.print("Input exponent: ");
		int exponent = read.nextInt();
		
		integerPower(base,exponent);
	}
}