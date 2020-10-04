package dataDrivenFramework;

import keywordDrivenFramework.IAutoConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ActiValidLoginTest implements IAutoConstants {
    public static void main(String[] args) throws IOException {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/rshekhar/login.do");
        FileLib flib = new FileLib();
        String un = flib.getCellData(EXCEL_PATH, "Valid", 0, 0);
        String pw = flib.getCellData(EXCEL_PATH, "Valid", 0, 1);
        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.name("pwd")).sendKeys(pw);
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        System.out.println(un + " " + pw);

    }
}
