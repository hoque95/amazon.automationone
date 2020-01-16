package amazon.automationone.pages;


import org.openqa.selenium.WebDriver;



public class HomePage extends MasterPage{
	String logo = "Id:nav-logo";

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean validateLogo() {
	return	isVisible(logo);
		
	}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	

}
