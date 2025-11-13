import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        int number=1+rand.nextInt(1000);
        int guess;
        do{
            System.out.print("Guess a number between 1 and 1000: ");
            guess=read.nextInt();
            if(guess<number)System.out.println("Too low. Try again.");
            else if(guess>number)System.out.println("Too high. Try again.");
        }while(guess!=number);
        System.out.println("Congratulations. You guessed the number!");
    }
}