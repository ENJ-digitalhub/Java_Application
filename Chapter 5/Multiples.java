import java.util.Scanner;
public class Multiples{
    public static boolean isMultiple(int a,int b){
        return b % a == 0;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = read.nextInt();
        System.out.print("Enter second number: ");
        int b = read.nextInt();
        System.out.println(isMultiple(a,b));
    }
}