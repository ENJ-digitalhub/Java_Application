import java.util.Scanner;
public class CircleArea{
    public static double circleArea(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = read.nextDouble();
        System.out.println(circleArea(r));
    }
}