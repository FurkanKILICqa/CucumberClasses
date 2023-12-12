package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src\\test\\resources\\features\\firstFeatureFile.feature",
        glue = "stepDefinitions",
        tags = "@US001",
        dryRun = false
        //dryRun da trure dersek featurefile da sarılık varmı diye kontrol eder false derssek direk çalistirir


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
