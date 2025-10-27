import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		double bal= 402234;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your firstname: ");
		
		String firstName = input.nextLine();
		System.out.printf("Hello, %s%n",firstName);
		
		System.out.print("Enter your lastname: ");
		
		String lastName = input.nextLine();
		System.out.printf("Hello, %s%n",lastName);
		
		System.out.print("Enter your age: ");
		
		short age = input.nextShort();
		System.out.printf("you are %d years old%n",age);
		System.out.printf("you have $%.2f in your account%n",bal);
	}
}