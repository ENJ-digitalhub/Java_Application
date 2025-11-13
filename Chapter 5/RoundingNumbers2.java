import java.util.Scanner;

public class RoundingNumbers2{
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		System.out.print("Input number: ");
		double num = read.nextDouble();
		double toInteger = Math.floor(num+0.5);
		double toTenths= Math.floor(num*10+0.5)/10;
		double toHundredths= Math.floor(num*10+0.5)/100;
		double toThousandths= Math.floor(num*10+0.5)/1000;
		System.out.printf("%f%n%f%n%f%n%f%n",toInteger,toTenths,toHundredths,toThousandths);
	}
}