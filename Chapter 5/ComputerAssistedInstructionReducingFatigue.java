import java.util.Scanner;
import java.util.Random;
public class ComputerAssistedInstructionReducingFatigue{
    public static void askQuestion(){
        Random r=new Random();
        Scanner read=new Scanner(System.in);
        int a=1+r.nextInt(9);
        int b=1+r.nextInt(9);
        int ans=-1;
        while(ans!=a*b){
            System.out.print("How much is "+a+" times "+b+"? ");
            ans=read.nextInt();
            if(ans==a*b){
                switch(r.nextInt(4)){
                    case 0: System.out.println("Very good!"); break;
                    case 1: System.out.println("Excellent!"); break;
                    case 2: System.out.println("Nice work!"); break;
                    case 3: System.out.println("Keep up the good work!"); break;
                }
            }else{
                switch(r.nextInt(4)){
                    case 0: System.out.println("No. Please try again."); break;
                    case 1: System.out.println("Wrong. Try once more."); break;
                    case 2: System.out.println("Don't give up! No."); break;
                    case 3: System.out.println("Keep trying."); break;
                }
            }
        }
    }
    public static void main(String[] args){askQuestion();}
}