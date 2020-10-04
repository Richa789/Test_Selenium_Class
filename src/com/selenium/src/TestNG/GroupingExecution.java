package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution {

    @Test(groups = "SmokeGroup")
    public void smoke11() {
        Reporter.log("Smoke Test 1", true);
    }

    @Test(groups = "SmokeGroup")
    public void smoke12() {
        Reporter.log("Smoke Test 2", true);
    }

    @Test(groups = "SmokeGroup")
    public void smoke13() {
        Reporter.log("Smoke Test 3", true);
    }

    @Test(groups = "FT")
    public void ft1() {
        Reporter.log("FT test 1", true);
    }

    @Test(groups = "FT")
    public void ft2() {
        Reporter.log("FT test 2", true);
    }

    @Test(groups = "SYST")
    public void syst1() {
        Reporter.log("SYST Test 1", true);
    }

    @Test(groups = "SmokeGroup")
    public void smoke14() {
        Reporter.log("Smoke test 4", true);
    }

    @Test(groups = "SYST")
    public void syst2() {
        Reporter.log("SYST test 2", true);
    }

}
