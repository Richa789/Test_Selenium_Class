package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {

    @Test
    public void bun() {
        Reporter.log("I am bun", true);
    }
}
