import java.util.Scanner;
public class ReversingDigits{
    public static int reverseDigits(int n){
        int rev=0;
        while(n!=0){rev=rev*10+n%10;n/=10;}
        return rev;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = read.nextInt();
        System.out.println(reverseDigits(n));
    }
}