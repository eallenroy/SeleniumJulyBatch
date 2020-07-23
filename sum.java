package wee1.day2;

public class sum {
	
	
	public static void main(String[] args) {
		sum arithmatic = new sum();
		arithmatic.sum();
		arithmatic.difference();
		
	}
public void sum() {
	int x;
	int y;
	int z;
	x=5;
	y=10;
	z=x+y;
			
	System.out.println("Sum of two numbers is");
	System.out.println(z);
}
public void difference() {
	int x;
	int y;
	int z;
	x=50;
	y=10;
	z=x-y;
			
		System.out.println("Difference of two numbers is");
	System.out.println(z);
}
}
