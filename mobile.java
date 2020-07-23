package wee1.day2;

public class mobile {
	
	public void makeCall() {
		System.out.println("making a call");
		}
public void sendSms() {
	System.out.println("sending an Sms");
}
public void takeSnap() {
	System.out.println("taking a Snap");
}
public static void main(String[] args) {
	mobile myMobile = new mobile();
	myMobile.makeCall();
	myMobile.sendSms();
	myMobile.takeSnap();
}

}
