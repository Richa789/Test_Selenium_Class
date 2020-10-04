package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[.='✕']")).click();
        WebElement electronicsObject = driver.findElement(By.xpath("//span[.='Electronics']"));
        Actions acObject = new Actions(driver);
        acObject.moveToElement(electronicsObject).perform();
        WebElement gLObj = driver.findElement(By.xpath("//a[.='Gaming Laptops']"));
        gLObj.click();
        driver.findElement(By.xpath("(//div[@class='DsQ2eg'])[1]")).click();
        WebElement errorMessage = driver.findElement(By.xpath("//div[.='Please login for wishlisting a product']"));
        if(errorMessage.isDisplayed()) {
            System.out.println("Error message is displayed");
        }
        else {
            System.out.println("Error message is not displayed");
        }
    }

}
