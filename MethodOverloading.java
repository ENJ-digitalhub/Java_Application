import java.util.Scanner;

public class MethodOverloading {
	public static void perimeter(int length){
		length*=4;
		System.out.println(length);
	}
	public static void perimeter(int length, int height){
		length*=2;
		height*=2;
		System.out.println(length+height);
	}
	public static void perimeter(double base, int height){
		height*=2;
		System.out.println(base+height);
	}
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-".repeat(20));
		System.out.println("Mensuration");
		System.out.println("-".repeat(20));
		int option;
		
		do{
			System.out.print("Perimeter of:\n1.Square\n2.Rectangle\n3.Triangle\n4.Exit\nOption:");
			option = input.nextInt();
		
			switch (option){
				case 1:
					System.out.print("Length of Square:");
					int length = input.nextInt();
					System.out.println("-".repeat(20));
					perimeter(length);
					break;
				case 2:
					System.out.print("Length of Rectangle:");
					length = input.nextInt();
					System.out.print("Height of Rectangle:");
					int height = input.nextInt();
					System.out.println("-".repeat(20));
					perimeter(length,height);
					break;
				case 3:
					System.out.print("Base of Triangle:");
					double base = input.nextDouble();
					System.out.print("Height of Triangle:");
					height = input.nextInt();
					System.out.println("-".repeat(20));
					perimeter(base,height);
					break;
				case 4:
					System.out.print("Closing Program .....");
					option=-1;
					break;
				default:
					System.out.println("Invalid input");				
			}
			
			if (option!=-1){
				System.out.println("Do you wanna continue?(Y/N)");
				char cont = input.next().charAt(0);
				if (cont == 'Y'|| cont=='y'){
					continue;
				}
				else {
					option=-1;
				}
			}
		}
		while (option!=-1);
	}
}
