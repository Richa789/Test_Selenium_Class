package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependentTestMethods {

    @Test
    public void transfer1() {
        Reporter.log("Successfully transferred 1", true);
    }

    @Test
    public void transfer2() {
        Reporter.log("Successfully transferred 2", true);
    }

    @Test(dependsOnMethods = {"transfer1", "transfer2"})
    public void delete() {
        Reporter.log("Successfully deleted", true);
    }

    @Test(dependsOnMethods = {"transfer1", "transfer2"}, alwaysRun = true)
    public void important() {
        Reporter.log("Important", true);
    }

}
