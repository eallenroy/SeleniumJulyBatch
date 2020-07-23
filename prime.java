package week1.day2;

public class prime {

	public static void main(String[] args) {
		int input=017;
		int count = 0;
				
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				count = count + 1;
			}
			
	}
		if (count == 2)
		{	
			System.out.println("The given number is prime number");
			
		}
		else {
			System.out.println("The given number is not a prime number");
		}

}
}
