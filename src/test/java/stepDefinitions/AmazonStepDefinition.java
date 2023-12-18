package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileNotFoundException;

public class AmazonStepDefinition {


    AmazonPage amazonPage = new AmazonPage();

    public AmazonStepDefinition() throws FileNotFoundException {
    }


    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.searcBox.sendKeys("iphone");
        amazonPage.searcBox.submit();
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratir")
    public void arama_kutusunda_samsung_aratir() {
        amazonPage.searcBox.sendKeys("samsung");
        amazonPage.searcBox.submit();
    }


    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.searcBox.sendKeys("nokia");
        amazonPage.searcBox.submit();
    }



    /*
    Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    amazonPage.searcBox.sendKeys("iphone");
    amazonPage.searcBox.submit();
    amazonPage.searcBox.sendKeys("samsung");
        amazonPage.searcBox.submit();
        Driver.getDriver().get(url);
        amazonPage.searcBox.sendKeys(str+ Keys.ENTER);

     */

}
