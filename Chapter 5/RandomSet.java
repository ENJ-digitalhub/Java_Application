public class RandomSet{
	public static int randomInt(int a){
		int n =(int)(Math.random()*a);
		return n;
	}
	public static void main(String[] args){
		int a = (randomInt(5)+1)*2;
		int b = ((randomInt(5)+1)*2)+1;
		int c = (((randomInt(5)+1)*2)+1)*2;
		System.out.printf("%d%n%d%n%d%n",a,b,c);
	}
}