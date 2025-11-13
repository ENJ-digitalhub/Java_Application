import java.util.Scanner;
public class DistanceBetweenPoints{
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2: ");
        double x1=read.nextDouble(),y1=read.nextDouble(),x2=read.nextDouble(),y2=read.nextDouble();
        System.out.println(distance(x1,y1,x2,y2));
    }
}