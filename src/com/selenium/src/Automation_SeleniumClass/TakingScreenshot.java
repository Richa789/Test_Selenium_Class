package Automation_SeleniumClass;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakingScreenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //THrough typecasting
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File destination = new File("C:\\Selenium\\Naukri.jpg");
//        Files.copy(source,destination);
        // Through Downcasting
//        RemoteWebDriver rwd = (RemoteWebDriver) driver;
//        File source = rwd.getScreenshotAs(OutputType.FILE);
//        File destination = new File("C:\\Selenium\\Google.png");
//        Files.copy(source, destination);
        //THrough EventFiringWebDriver Class
//        EventFiringWebDriver eventObj = new EventFiringWebDriver(driver);
//        File source = eventObj.getScreenshotAs(OutputType.FILE);
//        File destination = new File("C:\\Selenium\\Flipkart.jpg");
//        Files.copy(source, destination);
        // Taking Screenshot of a particular element
        WebElement amazonLogo = driver.findElement(By.xpath("//span[@class = 'nav-sprite nav-logo-base']"));
        File source = amazonLogo.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Selenium\\Amazon.jpg");
        Files.copy(source, destination);


    }
}
