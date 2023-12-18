package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hook {

    /*
    hooks classi ile scenariolardan once veya sonra calismasini istedigimiz kodlari
    io.cucumber.java.Before VE io.cucumber.java.After methodlari sayesinde yapariz
    Eger sadece istedigimiz scenariodan once calismasini istedigimiz bir kod olursa @Before notasyonu parantezi icine tagi belirtiriz
    Eger sadece istedigimiz scenariodan sonra calismasini istedigimiz bir kod olursa @After notasyonu parantezi icine tagi belirtiriz
    Dolayisiyla bu sekilde sadece tagi belirttigimiz scenariodan once veya sonra calistirilir
     */

    @Before
    public static void setUp() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test senaryosunda önce çalişir");
    }

    @Before("honda")//sadece honda dan önce çalışacak
    public static void setUp2() throws Exception {
        System.out.println("Hook classindaki @honda methodu her test senaryosunda önce çalişir");
    }
    @After("toyota")
    public static void tearDown2() throws Exception {
        System.out.println("Hook classindaki @toyota methodu her test senaryosunda sonra çalişir");
    }


    @After
    public static void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scnario"+scenario.getName());
            Driver.getDriver().close();
        }


    }






}
