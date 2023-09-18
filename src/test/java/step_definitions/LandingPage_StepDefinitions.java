package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LandingPage;
import utilities.Driver;

public class LandingPage_StepDefinitions {

    LandingPage landingPage;

    @Given("User enter {string}")
    public void user_enter(String url) {
        Driver.getDriver().get(url);
    }
    @Then("User should be able to see {string}")
    public void user_should_be_able_to_see(String nameOfTitle) {
        landingPage.validation(nameOfTitle);
    }

}
