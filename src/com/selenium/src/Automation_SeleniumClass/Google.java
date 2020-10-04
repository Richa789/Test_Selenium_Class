package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement textBoxAddr = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        textBoxAddr.sendKeys("qspiders hyderabad");
        Thread.sleep(2000);
        List<WebElement> allOptions = driver.findElements(By.xpath("//li[contains(@class, 'sb')]"));
        System.out.println("Number of options available are " + allOptions.size());
        for(int i =0; i < allOptions.size(); i++) {
            if(allOptions.get(i).getText().equals("qspiders hyderabad courses")) {
                allOptions.get(i).click();
                break;
            }
        }
    }
}
