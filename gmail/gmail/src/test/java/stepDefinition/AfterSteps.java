package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.BaseClass;

public class AfterSteps {

	@After
	public void tearDown(Scenario scenario) {		
		BaseClass.cleanUp();
		System.out.println("Browser is closed and everything is now clean");
	}
}