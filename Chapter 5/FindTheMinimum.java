import java.util.Scanner;
public class FindTheMinimum{
    public static double minimum3(double a,double b,double c){return Math.min(a,Math.min(b,c));}
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a=read.nextDouble(),b=read.nextDouble(),c=read.nextDouble();
        System.out.println(minimum3(a,b,c));
    }
}