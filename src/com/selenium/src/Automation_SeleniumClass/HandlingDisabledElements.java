package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/5570/Desktop/Programs/DisabledElement.html");
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("document.getElementById('i2').value='Manager'");
        // Through downcasting
//        RemoteWebDriver rwd = (RemoteWebDriver) driver;
//        rwd.executeScript("document.getElementById('i2').value='Manager'");
        WebElement untb = driver.findElement(By.id("i1"));
        if(untb.isEnabled()) {
            System.out.println("Username is enabled");
        }
        else {
            System.out.println("Username textbox is disabled");
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.getElementById('i1').value='admin'");
        }
        WebElement pwtb = driver.findElement(By.id("i2"));
        if(pwtb.isEnabled()) {
            System.out.println("Password textbox is enabled");
        }
        else {
            System.out.println("Password textbox is disabled");
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.getElementById('i2').value='manager'");
        }
    }
}
