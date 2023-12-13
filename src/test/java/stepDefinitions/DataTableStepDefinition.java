package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();

    @When("kullanici sayfadaki new butonuna basar")
    public void kullaniciSayfadakiNewButonunaBasar() {
    }

    @And("kullanici verilen bilgileri girer {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void kullaniciVerilenBilgileriGirer(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
    }

    @And("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String arg0) {
    }

    @Then("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String arg0) {
    }
}
