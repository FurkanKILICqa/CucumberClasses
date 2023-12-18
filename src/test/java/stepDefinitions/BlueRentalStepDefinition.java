package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.util.List;

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
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

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

    @And("verilen email ve password ile login olur")
    public void verilenEmailVePasswordIleLoginOlur(DataTable dataTable) {

        List<List<String>> emailPasword = dataTable.asLists();
        System.out.println("emailPasword = " + emailPasword);
        /*
        [  [email, password],
        [sam.walker@bluerentalcars.com, sami],
        [john_doe@gmail.com, johndoe],
        [johnson@bluerentalcars.com, johnson]  ]
         */

        for (int i = 1; i < emailPasword.size(); i++) {

            String email = emailPasword.get(i).get(0);
            String password = emailPasword.get(i).get(1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);

            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();

        }

        //2.yolu

        for (int i = 1; i < dataTable.asLists().size(); i++) {

            String email = dataTable.row(i).get(0);
            String password = dataTable.row(i).get(1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);

            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();


        }
    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sayfaIsmi) {
        ExcelReader excelReader = new ExcelReader("",sayfaIsmi);


    }
}
