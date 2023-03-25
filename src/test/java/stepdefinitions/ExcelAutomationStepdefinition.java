package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BlueRentalCars_Homepage;
import pages.BlueRentalCars_Loginpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelAutomationStepdefinition  {
ExcelUtils excelUtils;
BlueRentalCars_Homepage blueRentalCarsHomepage;
BlueRentalCars_Loginpage blueRentalCarsLoginpage;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) {

 String path ="./src/test/resources/mysmoketestdata.xlsx";
 excelUtils=new ExcelUtils(path,string);
 List<Map<String,String>> exceldatas= excelUtils.getDataList();
 blueRentalCarsHomepage =new BlueRentalCars_Homepage();
 blueRentalCarsLoginpage=new BlueRentalCars_Loginpage();
 for(Map<String,String> eachdata:exceldatas){
     Driver.getDriver().get(ConfigReader.getProperty("appurl"));
     blueRentalCarsHomepage.login.click();
     blueRentalCarsLoginpage.email.sendKeys(eachdata.get("username"));
     blueRentalCarsLoginpage.pass.sendKeys(eachdata.get("password"));
     blueRentalCarsLoginpage.loginpagelogin.click();
     assert blueRentalCarsHomepage.idbut.isDisplayed();
     blueRentalCarsHomepage.idbut.click();
     blueRentalCarsHomepage.logout.click();
     blueRentalCarsHomepage.okbutton.click();
 }

    }

}
