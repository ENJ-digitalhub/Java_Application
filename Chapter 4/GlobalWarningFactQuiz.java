import java.util.Scanner;

public class GlobalWarningFactQuiz{
	public static void question (int x){
		switch (x){
			case 1:
			System.out.println("1.What is the main greenhouse gas responsible for global warming?\nA) Oxygen\nB) Carbon dioxide\nC) Nitrogen\nD) Helium");
			break;
			case 2:
			System.out.println("2. Which human activity contributes most to global warming?\nA) Planting trees\nB) Driving electric cars\nC) Burning fossil fuels\nD) Recycling");
			break;
			case 3:
			System.out.println("3. What happens to sea levels as the Earth’s temperature increases?\nA) They stay the same\nB) They go down\nC) They go up\nD) They freeze");
			break;
			case 4:
			System.out.println("4. Which of these is a possible effect of global warming?\nA) More polar ice\nB) Cooler summers\nC) Stronger storms and floods\nD) Fewer droughts");
			break;
			case 5:
			System.out.println("5. What international agreement aims to reduce global warming by limiting greenhouse gas emissions?\nA) Paris Agreement\nB) Kyoto Festival\nC) World Trade Pact\nD) Earth Summit Rules");
			break;
		}
	}
	public static char answer(int y){
		char ans='z';
		switch (y){
			case 1:
			ans = 'b';
			break;
			case 2:
			ans = 'c';
			break;
			case 3:
			ans = 'c';
			break;
			case 4:
			ans = 'c';
			break;
			case 5:
			ans = 'a';
			break;
		}
		return ans;
	}
	public static void main(String[] args){
		int score = 0;
		String educationalWebLinks = "https://www.epa.gov/climate-change/climate-change-resources-educators-and-students\nhttps://www.noaa.gov/education/resource-collections/climate/climate-change-impacts\nhttps://www.takeactionglobal.org/\nhttps://www.climate.gov/teaching\nhttps://unccelearn.org/\nunccelearn.org";
		
		Scanner read = new Scanner(System.in);
		
		for (int n=1;n<=5;n++){
			question(n);
			char answer = read.next().charAt(0);
			if (Character.toLowerCase(answer)==answer(n)){
				score++;
			}
		}
		if (score==5){
			System.out.println("Excellent");
		}
		else if (score==4){
			System.out.println("Very good");
		}
		else{
			System.out.printf("Time to brush up on your knowledge of global warming\n%s",educationalWebLinks);
		}
		read.close();
	}
}
