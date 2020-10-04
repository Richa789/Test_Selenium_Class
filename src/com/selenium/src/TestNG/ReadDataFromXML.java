package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXML {

    @Parameters({"username", "password"})
    @Test
    public void getDataFromXML(String un, String pwd) {
        System.out.println(un);
        System.out.println(pwd);

    }
}
