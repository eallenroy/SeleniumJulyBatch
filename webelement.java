package week1.day2;
import org.openqa.selenium.chrome.ChromeDriver;
public class webelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElementByName("q").sendKeys("eallen roy nanoparticles");
		driver.findElementByClassName("btnK").click();
	}

}
