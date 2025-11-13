import java.util.Scanner;
public class TemperatureConversions{
    public static double celsius(double f){return 5.0/9*(f-32);}
    public static double fahrenheit(double c){return 9.0/5*c+32;}
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double t = read.nextDouble();
        System.out.print("Enter type (C/F): ");
        String type = read.next();
        if(type.equalsIgnoreCase("F")){System.out.println(celsius(t));}
        else{System.out.println(fahrenheit(t));}
    }
}