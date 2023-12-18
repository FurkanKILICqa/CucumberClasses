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


    @Before
    public static void setUp() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test senaryosunda önce çalişir");
    }

    @Before("honda")//sadece honda dan önce çalışacak
    public static void setUp2() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test senaryosunda önce çalişir");
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
