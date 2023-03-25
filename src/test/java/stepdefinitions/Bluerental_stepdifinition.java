package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCars_Homepage;
import pages.BlueRentalCars_Loginpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Bluerental_stepdifinition {
    BlueRentalCars_Homepage    blueRentalCarsHomepage=new BlueRentalCars_Homepage();
    BlueRentalCars_Loginpage blueRentalCarsLoginpage =new BlueRentalCars_Loginpage();
    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @When("user clicks  login button")
    public void user_clicks_login_button() {
    blueRentalCarsHomepage.login.click();
    }
    @When("user enters {string} adress")
    public void user_enters_adress(String string) {
blueRentalCarsLoginpage.email.sendKeys(string);
    }
    @When("user enters {string}")
    public void user_enters(String string) {
 blueRentalCarsLoginpage.pass.sendKeys(string);
    }
    @When("user clicks loginpagelogin button")
    public void user_clicks_loginpagelogin_button() {
      blueRentalCarsLoginpage.loginpagelogin.click();
        ReusableMethods.waitFor(5);
    }
    @Then("user checks that he is logged in")
    public void user_checks_that_he_is_logged_in() {
Assert.assertTrue(blueRentalCarsHomepage.idbut.isDisplayed());

    }
    @Then("close the application")
    public void close_the_application() {
   Driver.closeDriver();
    }
}
