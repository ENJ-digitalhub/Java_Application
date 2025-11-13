import java.util.Scanner;
public class SeparatingDigits{
    public static int integerQuotient(int a,int b){return a/b;}
    public static int integerRemainder(int a,int b){return a%b;}
    public static void displayDigits(int n){
        int divisor=10000;
        boolean leading=false;
        for(int i=0;i<5;i++){
            int digit=n/divisor;
            if(digit!=0 || leading || divisor==1){leading=true; System.out.print(digit+"  ");}
            n%=divisor;
            divisor/=10;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter integer 1-99999: ");
        int n = read.nextInt();
        displayDigits(n);
    }
}