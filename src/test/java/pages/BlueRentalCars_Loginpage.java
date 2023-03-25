package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCars_Loginpage {
    public BlueRentalCars_Loginpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement pass;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginpagelogin;

}
