import java.util.Scanner;

public class TaxplanAlternativeTheFairTax{
	public static void main (String[] args){
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Input Expences(Housing,Food,Clothing,Transportation,Education,Health Care,Vacation): ");
		
		double housing = read.nextDouble();
		double food = read.nextDouble();
		double clothing = read.nextDouble();
		double transportation = read.nextDouble();
		double education = read.nextDouble();
		double healthCare = read.nextDouble();
		double vacation = read.nextDouble();
		
		double totalExpenses = housing+food+clothing+transportation+education+healthCare+vacation;
		double fairTax = totalExpenses * 0.23;
		
		System.out.println("Estimated Fair Tax: "+fairTax);
		read.close();
	}
}