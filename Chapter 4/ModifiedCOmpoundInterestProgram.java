public class ModifiedCOmpoundInterestProgram{
	public static void main (String[] args){
		double principal=1000;
		for (int rate=5;rate<=10;rate++){
			double rateDecimal=rate/100.0;
			System.out.println("Interesr Rate:"+rate+"%");
			for(int year=1;year<=10;year++){
				double amount=principal*Math.pow((1+rateDecimal),year);
				System.out.println("Year: "+year);
				System.out.println("Amount: "+amount);
			}
		}
	}
}