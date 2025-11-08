public class Factorial1Through20{
	public static long factorial(long x){
		if (x <= 1)
            return 1;
        else
            return x * factorial(x - 1);
	}
	public static void main(String[] args){
		System.out.println("Number\t|\tFactorial");
		long num = 20;
		long factorial = factorial(num);
		System.out.printf("%d\t|\t%d%n",num,factorial);
	}
}