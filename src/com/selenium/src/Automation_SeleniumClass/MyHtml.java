package Automation_SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyHtml {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/5570/Desktop/Programs/flavour.html");
       WebElement addr =  driver.findElement(By.name("taj"));
        System.out.println(addr.getSize());
        Select sel = new Select(addr);
        if(sel.isMultiple()) {
            System.out.println("It is multi select dropdown");
        }
        else {
            System.out.println("It is single select dropdown");
        }
        sel.selectByVisibleText("straw");
        sel.selectByIndex(3);
    }
}
