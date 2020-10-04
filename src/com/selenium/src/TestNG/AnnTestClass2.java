package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnTestClass2 extends Annotations {

    @Test
    public void run3() {
        Reporter.log("I am run3 method", true);
    }
}
