package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileNotFoundException;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    public BlueRentalStepDefinition() throws FileNotFoundException {
    }

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }


    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalPage.loginButton.click();

    }


    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {

    }

    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {

        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);


    }

    @Then("login oldugunu dogrular")
    public void loginOldugunuDogrular() {

        //1.Assertion
        boolean isLoginTrue = !blueRentalPage.loginVerify.getText().equals("login");
        Assert.assertTrue(isLoginTrue);

        //2.Assertion
        Assert.assertFalse(blueRentalPage.loginVerify.getText().equals("login"));

        //3.Assertion
        Assert.assertNotEquals("login", blueRentalPage.loginVerify.getText());
    }
}
