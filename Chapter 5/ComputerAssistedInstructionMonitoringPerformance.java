import java.util.Scanner;
import java.util.Random;
public class ComputerAssistedInstructionMonitoringPerformance{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        Random r=new Random();
        int correct=0,incorrect=0;
        for(int i=0;i<10;i++){
            int a=1+r.nextInt(9),b=1+r.nextInt(9),ans=-1;
            while(ans!=a*b){
                System.out.print("How much is "+a+" times "+b+"? ");
                ans=read.nextInt();
                if(ans==a*b)correct++;
                else incorrect++;
            }
        }
        int percent=correct*100/(correct+incorrect);
        if(percent<75)System.out.println("Please ask your teacher for extra help.");
        else System.out.println("Congratulations, you are ready to go to the next level!");
    }
}