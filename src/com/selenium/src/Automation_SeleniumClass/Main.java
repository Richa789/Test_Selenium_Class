package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        if(driver.getTitle().equals("Google")) {
            System.out.println("Home page is displayed");
        }
        else {
            System.out.println("Home page is not displayed");
        }
        driver.findElement(By.name("q")).sendKeys("Hats");
    }
}
