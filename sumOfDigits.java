package wee1.day2;

public class sumOfDigits {
	public static void main(String[] args) {
		int sum = 0;
		int n = 124;
		while(n != 0) 
		{
			sum = sum + n % 10;
			n = n/10;
		}
		System.out.println("Sum of digits of given number is ");
		System.out.println(sum);
	}

}
