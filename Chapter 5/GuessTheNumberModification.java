import java.util.Scanner;
import java.util.Random;
public class GuessTheNumberModification{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        int number=1+rand.nextInt(1000);
        int guess,count=0;
        do{
            System.out.print("Guess a number between 1 and 1000: ");
            guess=read.nextInt();
            count++;
            if(guess<number)System.out.println("Too low. Try again.");
            else if(guess>number)System.out.println("Too high. Try again.");
        }while(guess!=number);
        System.out.println("Congratulations. You guessed the number!");
        if(count<=10)System.out.println("Either you know the secret or you got lucky!");
        else System.out.println("You should be able to do better!");
    }
}