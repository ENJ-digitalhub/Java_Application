import java.util.Scanner;

public class ParkingCharges{
	public static double calculateCharges(double hours){
		double charge = 0;
		if (hours <=3){
			return 2.0;
		}
		else {
			double extrahours = hours - 3;
			charge = 2.0+0.5*extrahours;
		}
		if (charge>10){
			return 10.0;
		}
		else{
			return charge;
		}
	}
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		double hoursParked = 0;
		double totalCharges = 0;
		while(hoursParked>0){
			System.out.print("Input hours parked(-1 to end): ");
			hoursParked = read.nextDouble();
			if (hoursParked==-1){
				break;
			}
			double charge = calculateCharges(hoursParked);
			System.out.println(charge);
			totalCharges+=charge;
		}
		System.out.println("Total Charges = "+totalCharges);
	}
}