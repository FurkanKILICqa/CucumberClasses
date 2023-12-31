package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//==> console da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"},
        features ="src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@US011",
        dryRun = false,
        monochrome = true

)
public class Runner {
    /*
    Runner classin bodysi icinde birsey yazilmaz
    Runner classinda önemli olan iki tane notasyon vardir
    1)@RunWith ==>Runner clasimiza calisma özelligi getirdi
    2)@CucumberOptions ==> parantezi icinde hangi testleri calistiracağımızı,
                    hangi raporlari alacağımızı, features ve glue parametreleri ile bu dosyalarin pathlerini
                    gibi test ayrintilarini tanimlariz ve bazi pluginler ekleyebiliriz
      dryRun = true  ==> iken feature file daki test senaryolarini calistirmadan, eksik
      stepDefinition i olup olmadigini kontrol eder, browseri calistirmaz

 */
}
