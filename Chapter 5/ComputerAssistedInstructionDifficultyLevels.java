import java.util.Scanner;
import java.util.Random;
public class ComputerAssistedInstructionDifficultyLevels{
    public static void askQuestion(int level){
        Random r=new Random();
        Scanner read=new Scanner(System.in);
        int max=(int)Math.pow(10,level)-1;
        int a=1+r.nextInt(max),b=1+r.nextInt(max),ans=-1;
        while(ans!=a*b){
            System.out.print("How much is "+a+" times "+b+"? ");
            ans=read.nextInt();
            if(ans!=a*b)System.out.println("No. Please try again.");
        }
        System.out.println("Very good!");
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter difficulty level: ");
        int level=read.nextInt();
        askQuestion(level);
    }
}