package cucumberSupportCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.automationone.pages.HomePage;
import amazon.automationone.pages.SoftwarePage;
import amazon.automationone.pages.SoftwareSelectionPage;

public class CucumberSupportCode {
	
	// This is Singleton approach
	// it create one instance
	private static  CucumberSupportCode instance;
	WebDriver driver;
	HomePage homePage;
	SoftwarePage softwarePage;
	SoftwareSelectionPage softwareSelectionPage;
	
	private CucumberSupportCode() {
	
	}
	
	public static CucumberSupportCode getInstance() {
		if(instance == null )
			instance = new CucumberSupportCode();
		return instance;
	}
	
	public WebDriver getdriver() {
		String readBrowser =(String)ReadPropertiesFile.readProperties().get("browser");
		if(driver == null) {
			if(readBrowser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hoque\\eclipse-workspace\\amazon.automationone\\Browser\\chromedriver.exe");
				driver =new ChromeDriver();
			}}
			return driver;
	}
	
	public HomePage getHomePage() {
		if (homePage== null) 
			homePage = new HomePage(driver);
		return homePage;
		
	}
	public SoftwarePage getSoftwarePage() {
		if (softwarePage== null) 
			softwarePage = new SoftwarePage(driver);
		return softwarePage;
		
	}
	
	public SoftwareSelectionPage getSoftwareSelectionPage() {
		if (softwareSelectionPage== null) 
			softwareSelectionPage = new SoftwareSelectionPage(driver);
		return softwareSelectionPage;
		
	}
	
	public WebDriver closeDriver() {
		if (driver != null) 
			driver.close();
		return driver;
		
	}
	

}
