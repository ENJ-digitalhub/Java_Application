public class MethodOverloading {
	public void perimeter(int length){
		length*=4;
		System.out.println(length);
	}
	public void perimeter(int length, int height){
		length*=2;
		height*=2;
		System.out.println(length+height);
	}
	public void perimeter(double base, int height){
		height*=2;
		System.out.println(base+height);
	}
	public static void main (String[] args){
		
		perimeter(4);
		perimeter(4,2);
		perimeter(3.0,4);
	}
}