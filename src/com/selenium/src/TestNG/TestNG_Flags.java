package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Flags {

    @Test(priority = 1)
    public void run() {
        Reporter.log("I am run", true);
    }

    @Test(priority = 2, enabled = false)
    public void gun() {
        Reporter.log("I am gun", true);
    }

    @Test(priority = 3, invocationCount = 3)
    public void bun() {
        Reporter.log("I am bun", true);
    }

}
