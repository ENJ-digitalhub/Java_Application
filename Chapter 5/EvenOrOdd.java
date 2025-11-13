import java.util.Scanner;
public class EvenOrOdd{
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = read.nextInt();
        System.out.println(isEven(n));
    }
}