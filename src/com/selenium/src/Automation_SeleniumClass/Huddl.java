package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Huddl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.gohuddl.com/welcome");
        String title = driver.getTitle();
        if(title.equals("Huddl")) {
            System.out.println("Login page is displayed");
        }
        else {
            System.out.println("Login page is not displayed");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[.='Join a Meeting']")).click();
        WebElement text = driver.findElement(By.xpath("//div[contains(.,'better') and @class='sc-jSfUZu MawZH']"));
        if(text.isDisplayed()) {
            System.out.println("Sign-in page is displayed");
        }
        else {
            System.out.println("Sign-in page is not displayed");
        }
    }
}