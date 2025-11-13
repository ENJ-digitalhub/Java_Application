import java.util.Scanner;
import java.util.Random;
public class ComputerAssistedInstructionVaryingProblemTypes{
    public static void askQuestion(int type,int level){
        Random r=new Random();
        Scanner read=new Scanner(System.in);
        int max=(int)Math.pow(10,level)-1;
        int a=1+r.nextInt(max),b=1+r.nextInt(max),ans=-1;
        int operation=type==5?r.nextInt(4)+1:type;
        while(ans!=-999){
            String opSymbol="";
            int correctAns=0;
            switch(operation){
                case 1: correctAns=a+b; opSymbol="+"; break;
                case 2: correctAns=a-b; opSymbol="-"; break;
                case 3: correctAns=a*b; opSymbol="*"; break;
                case 4: correctAns=a/b; opSymbol="/"; break;
            }
            System.out.print("How much is "+a+" "+opSymbol+" "+b+"? ");
            ans=read.nextInt();
            if(ans==correctAns)System.out.println("Very good!");
            else System.out.println("No. Please try again.");
            a=1+r.nextInt(max);
            b=1+r.nextInt(max);
            operation=type==5?r.nextInt(4)+1:type;
        }
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter problem type (1-5): ");
        int type=read.nextInt();
        System.out.print("Enter difficulty level: ");
        int level=read.nextInt();
        askQuestion(type,level);
    }
}