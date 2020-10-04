package Automation_SeleniumClass;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class AirIndia {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.airindia.in/");
        String loginTitle = driver.getTitle();
        if(loginTitle.equals("Welcome to Air India")) {
            System.out.println("Login page is :  " + loginTitle);
        }
        else {
            System.out.println("Login page is not displayed");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement manageTrip = driver.findElement(By.id("aMnu1"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(manageTrip).perform();
        Thread.sleep(2000);
        WebElement home = driver.findElement(By.id("aMnu0"));
        action.contextClick(home).perform();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[.='Latest News']"));
        Point loc = element.getLocation();
        System.out.println(loc);
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy" + loc);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyRelease(KeyEvent.VK_E);
        WebElement toll = driver.findElement(By.xpath("//span[.='TOLL NUMBER']"));
        action.doubleClick(toll).perform();
//        driver.findElement(By.xpath("//a[@id='aMnu2']")).click();
//        String offers = driver.getTitle();
//        if(offers.equals("Special Offers - Air India")) {
//            System.out.println("Special offers page is displayed");
//        }
//        else {
//            System.out.println("Special offers page is not displayed");
//        }
//        driver.findElement(By.xpath("//a[@id='aMnu6']")).click();
//        String contact = driver.getTitle();
//        if(contact.equals("Customer Support - Air India")) {
//            System.out.println("Contact page is displayed");
//        }
//        else {
//            System.out.println("Contact page is not displayed");
//        }
//        driver.findElement(By.xpath("//a[.='Baggage']")).click();
//        String baggage = driver.getTitle();
//        if(baggage.equals("Baggage - Air India")) {
//            System.out.println("Baggage page is displayed");
//        }
//        else {
//            System.out.println("Baggage page is not displayed");
//        }
           WebElement tollNumber =  driver.findElement(By.id("aMnu3"));
        System.out.println(tollNumber.getAttribute("id"));
        System.out.println(tollNumber.getCssValue("font-size"));

    }
}
