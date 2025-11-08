import java.util.Scanner;

public class FindTheSmallestValue{
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		
		int smallest;
		System.out.print("Input Interger(input -1 if done): ");
		smallest = read.nextInt();
		
		while (smallest!=-1){
			int num=read.nextInt();
			if (num==-1){
				break;
			}
			else if (num<smallest){
				smallest=num;
			}
		}
		System.out.println("Smallest->"+smallest);
		read.close();
	}
}