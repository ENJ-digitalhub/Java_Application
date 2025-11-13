import java.util.Random;
import java.util.Scanner;
public class CrapsGameModification{
    public static int rollDice(){
        Random r=new Random();
        return 1+r.nextInt(6)+1+r.nextInt(6);
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int bankBalance=1000;
        System.out.print("Enter wager: ");
        int wager=read.nextInt();
        while(wager>bankBalance){System.out.print("Reenter wager: ");wager=read.nextInt();}
        int sum=rollDice();
        if(sum==7||sum==11){bankBalance+=wager;}
        else{bankBalance-=wager;}
        System.out.println("Bank Balance: "+bankBalance);
        if(bankBalance==0)System.out.println("Sorry. You busted!");
    }
}