package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCars_Homepage {
    public BlueRentalCars_Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement login;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement idbut;
    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement logout;
    @FindBy(xpath = "//button[@class='ajs-button ajs-ok']")
    public WebElement okbutton;
}
