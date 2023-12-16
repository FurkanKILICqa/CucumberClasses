package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//==> console da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",
                "rerun:TestOutput/failed_scenario.txt" },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@US002",
        dryRun = false,
        monochrome = true

)
public class ParallelRunner2 {
}
/*
    Runner class bodysi icinde birsey yazilmaz
    Runner classinda önemli olan iki tane notasyon vardir
    1)@RunWith(Cucumber.class) ==>Runner classimiza calisma ozelligi verir
    2)@CucumberOptions ==> parantezi icinde hangi testleri calistiracağımızı, hangi raporlari
    alacağımızı, features ve glue parametrelerini ve diger test e dair ayrintilari ve cesitli
    plugin ekleyebiliriz
    dryRun = true => iken feature file daki test senaryolarini calistirmadan, eksik stepDefinition
    olup olmadigini kontrol eder, browseri acmaz

    rerun plugini ile fail olan scenariolari burada belirtmis oldugumuz failed_scenario.txt dosyasi icinde tutabiliriz
 */

