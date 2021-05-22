package stepDefinition;

import io.cucumber.java.Before;
import utils.BaseClass;
import utils.HelperClass;

public class BeforeSteps {
	@Before
    public void setup(){
        BaseClass.setupBrowser();
        HelperClass.waitforpageload();
        
        System.out.println("browser is up and on gmail page");
    }
}