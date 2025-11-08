public class FacebookUserBaseGrowth2000000000{
	public static void main(String[] args){
		
		double user = 1000000000;
		double rate = 0.04;
		int month = 0;
		
		while(user<2000000000){
			user*=(1+rate);
			month++;
		}
		System.out.println("Months to reach 1.5 billion = "+month);
	}
}