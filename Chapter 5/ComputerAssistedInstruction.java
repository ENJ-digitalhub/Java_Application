import java.util.Scanner;
import java.util.Random;
public class ComputerAssistedInstruction{
    public static void askQuestion(){
        Random r=new Random();
        Scanner read=new Scanner(System.in);
        int a=1+r.nextInt(9);
        int b=1+r.nextInt(9);
        int ans=-1;
        while(ans!=a*b){
            System.out.print("How much is "+a+" times "+b+"? ");
            ans=read.nextInt();
            if(ans!=a*b)System.out.println("No. Please try again.");
        }
        System.out.println("Very good!");
    }
    public static void main(String[] args){askQuestion();}
}