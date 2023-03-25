package runners;
//tagi sil features kismi txt dosya yap

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,//raporlari consolda duzgun gorebilmek icin
        features = "@target/failed_scenarios.txt",//.txt folder path
        glue = {"stepdefinitions","hooks"},  //stepdefinitions path
        dryRun = false


)

public class FailedRunner {

}
