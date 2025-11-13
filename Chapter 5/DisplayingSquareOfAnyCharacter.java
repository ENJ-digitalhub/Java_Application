import java.util.Scanner;
public class DisplayingSquareOfAnyCharacter{
    public static void squareOfCharacter(int side,char fillCharacter){
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = read.nextInt();
        System.out.print("Enter character: ");
        char fill = read.next().charAt(0);
        squareOfCharacter(side,fill);
    }
}