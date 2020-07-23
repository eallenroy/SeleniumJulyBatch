package wee1.day2;

public class oddNumber {
	public static void main(String[] args) {
		int input;
		
		int number = 1;
		input = 29;
		System.out.println("The odd numbers are given below");
		
		
		for(number = 1;number <= input;number++) {
			if(number % 2 != 0 ) {
				System.out.println(number);
			}
		}
		
	}
	

}
