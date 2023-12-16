package stepDefinitions;

import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinition {


    @Test
    public void name() throws AWTException {

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(2);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(2);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_O);
    }
}
