package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Firstcry {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://www.firstcry.com/");
        WebElement gear = driver.findElement(By.xpath("//a[.=' Gear']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(gear).perform();
//        driver.get("https://www.google.co.in/");
//        driver.get("https://www.facebook.com/");
    }
}
