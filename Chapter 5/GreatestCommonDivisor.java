import java.util.Scanner;
public class GreatestCommonDivisor{
    public static int gcd(int a,int b){
        while(b!=0){int t=b;b=a%b;a=t;}
        return a;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=read.nextInt(),b=read.nextInt();
        System.out.println(gcd(a,b));
    }
}