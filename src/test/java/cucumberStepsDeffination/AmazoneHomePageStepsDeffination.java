package cucumberStepsDeffination;

import cucumberSupportCode.CucumberSupportCode;
import cucumberSupportCode.ReadPropertiesFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazoneHomePageStepsDeffination {
	 CucumberSupportCode instance;
	
	
	
	

@Given("I am at Amazon HomePage")
public void i_am_at_Amazon_HomePage() {
	instance = CucumberSupportCode.getInstance();
	instance.getdriver().get(ReadPropertiesFile.readProperties().get("url"));
	
	
	
    
}

@Then("logo is visible and I validate")
public void logo_is_visible_and_I_validate() {
	instance.getHomePage().validateLogo();
   instance.closeDriver();
}



}
