package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GoogleStepDefinition {


    GooglePage googlePage= new GooglePage();


        @When("google arama kutusunda {string} aratir")
        public void googleAramaKutusundaAratir(String arac) {
            googlePage.searchbox.sendKeys(arac, Keys.ENTER);
        }

        @Then("sayfa basliginin {string} icerdigini test eder")
        public void sayfaBasligininIcerdiginiTestEder(String arac) {
            Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
        }

        @But("kullanici {int} saniye bekler")
        public void kullaniciSaniyeBekler(int saniye) {
            ReusableMethods.bekle(saniye);
        }





        @When("kullanici verilen bilgiler ile arama yapar")
        public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {

            List<String> dataTableList = data.asList();

            for (int i = 0; i < dataTableList.size(); i++) {
                googlePage.searchbox.sendKeys(dataTableList.get(i)+Keys.ENTER);
                Assert.assertTrue(Driver.getDriver().getTitle().contains(dataTableList.get(i)));
                googlePage.searchbox.clear();
            }

        }


        @When("kullanici verilen bilgiler ile arama yapar ikinci yol")
        public void kullaniciVerilenBilgilerIleAramaYaparIkinciYol(List<String>list) {

            for (String w :list  ) {
                googlePage.searchbox.sendKeys(w+Keys.ENTER);
                Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
                googlePage.searchbox.clear();
            }


}
}
