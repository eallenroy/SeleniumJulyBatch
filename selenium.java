package week1.day2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//WebElement eleUserName = driver.findElementById("username");
		//eleUserName.sendKeys("demosalesmanager");//
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Roy");
		driver.findElementById("createLeadForm_firstName").sendKeys("Allen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Roy E");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		dropDown.selectByValue("LEAD_EMPLOYEE");
		WebElement source1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDownId = new Select(source1);
		dropDownId.selectByValue("9001");
		WebElement source2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDownIds = new Select(source2);
		dropDownIds.selectByValue("IND_TELECOM");
		WebElement source3 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDownIdsa = new Select(source3);
		dropDownIdsa.selectByValue("IND");
		driver.findElementByXPath("//input[@class='smallSubmit' and @type='submit']").click();
	
	}

}
