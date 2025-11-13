import java.util.Random;
import java.util.Scanner;
enum Coin{HEADS,TAILS}
public class CoinTossing{
    public static Coin flip(){
        return new Random().nextBoolean()?Coin.HEADS:Coin.TAILS;
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int heads=0,tails=0;
        System.out.print("Toss coins? (y/n): ");
        String ans=read.next();
        while(ans.equalsIgnoreCase("y")){
            Coin c=flip();
            System.out.println(c);
            if(c==Coin.HEADS)heads++;else tails++;
            System.out.print("Toss again? (y/n): ");
            ans=read.next();
        }
        System.out.println("Heads:"+heads+" Tails:"+tails);
    }
}