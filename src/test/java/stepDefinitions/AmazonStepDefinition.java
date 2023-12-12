package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileNotFoundException;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    public AmazonStepDefinition() throws FileNotFoundException {
    }

    @Given("kullanici amazon sayfasına gider")
    public void kullanici_amazon_sayfasına_gider() {
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







}
