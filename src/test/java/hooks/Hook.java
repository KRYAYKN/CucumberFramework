package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hook {
    /*
Hooks her bir senario veya senario outline dan once veya sonra calismasini istedigimiz metodlar konur
@Before ve @Afte metotlarini icerir
burda onmeli olan raporlam islemlerinin ekran goruntusu ie birlikte hooks yardimiyla yapilmasidir.
 */
    @Before
    public void setupScenarios(){
        System.out.println("Before Metodu");

    }
    @After
    public void tearDownScenarios(Scenario scenario){
        //eger bir scenario FAIL ederse ekran goruntusunu al ve rapora ekle
        System.out.println("After Metodu");
        final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(failedScreenshot,"image/png","failed_scenario_"+scenario.getName());
        Driver.closeDriver();
    }

}
