public class RandomIntegers{
	public static void randomInt(int a, int b){
		int n = a + (int)(Math.random()*b);
		System.out.println(n);
	}
	public static void main(String[] args){
		randomInt(1,2);
		randomInt(1,100);
		randomInt(0,9);
		randomInt(1000,1112);
		randomInt(-1,1);
		randomInt(-3,11);
	}
}