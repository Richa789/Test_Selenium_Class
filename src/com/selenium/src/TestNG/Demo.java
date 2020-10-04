package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {


    @Test(description = "Create customer")
    public void run() {
        //System.out.println("Hello Richa");
        Reporter.log("I am run", true);
    }

}
