package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

    @Test
    public void verifyLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/rshekhar/login.do");

        String loginTitle = driver.getTitle();
        //Assert.assertEquals(loginTitle, "actiTIME - Login");
        SoftAssert assertObject = new SoftAssert();
        assertObject.assertEquals(loginTitle, "actiTIME - Logi");

        driver.findElement(By.id("username")).sendKeys("ranu.rich@gmail.com");
        driver.findElement(By.name("pwd")).sendKeys("DuMugy7U");
        assertObject.assertAll();
    }

}
