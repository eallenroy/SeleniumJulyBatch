package week1.day2;

public class factorial {

	public static void main(String[] args) {
		
		int input=3;
		int fact=1;
		for (int i =1; i <=input; i++) {
			fact=fact*i;
			
			
		}
		System.out.println("The factorial of given number is " + fact);
		//System.out.println(fact);

	}

}
