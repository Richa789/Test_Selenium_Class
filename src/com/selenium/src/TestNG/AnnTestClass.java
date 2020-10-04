package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@BeforeClass
public class AnnTestClass extends Annotations{

    //@BeforeMethod
    @Test
    public void run1() {
        Reporter.log("I am run1 method", true);
    }
    //@AfterMethod

    //@BeforeMethod
    @Test
    public void run2() {
        Reporter.log("I am run2 method", true);
    }
    //@AfterMethod
}
//@AfterClass
