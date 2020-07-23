package wee1.day2;

public class Employer {
	
	String mobileNumber = "9944110357";
	
	public void employername() {
		System.out.println("Allen Roy E");
	}
	
	public static void main(String[] args) {
		Employer myEmp = new Employer(); 
		myEmp.employername();
				
		char employerinitial = 'E';
		int employerage = 43;
		
		System.out.println(employerinitial);
		System.out.println(employerage);
		System.out.println(myEmp.mobileNumber);
		

	}

}
