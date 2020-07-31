package week3.day1;

public class LearnPoly {

	public void Cognizant(int ID) {
		System.out.println("Cognizant Emp ID");

	}
	public void Cognizant(int ID,int phn) {
		System.out.println("Cognizant Emp ID and phone");

	}
	public void Cognizant(String ID) {
		System.out.println("Cognizant Emp Name");

	}
	
	public static void main(String[] args) {
		LearnPoly ear=new LearnPoly();
		ear.Cognizant("allen Roy");
		ear.Cognizant(765);
		ear.Cognizant(765,3454);
		

	}

}
