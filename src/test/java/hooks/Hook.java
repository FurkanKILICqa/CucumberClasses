package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Hook {


    @Before
    public static void beforeClass() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test senaryosunda önce çalişir");
    }


    @After
    public static void afterClass() throws Exception {

        System.out.println("Hook classindaki @Before methodu her test senaryosunda sonra çalişir");

    }






}
