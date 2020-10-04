package dataDrivenFramework;

import keywordDrivenFramework.IAutoConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ActiInvalidLoginTest implements IAutoConstants {
    public static void main(String[] args) throws IOException {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/rshekhar/login.do");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FileLib flib = new FileLib();
        int rowCount = flib.getRowCount(EXCEL_PATH, "Invalid");
        for (int i = 1; i <= rowCount; i++) {
            String username = flib.getCellData(EXCEL_PATH, "Invalid", i, 0);
            String password = flib.getCellData(EXCEL_PATH, "Invalid", i, 1);
            System.out.println(username + " " + password);

            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.name("pwd")).sendKeys(password);
            driver.findElement(By.xpath("//div[.='Login ']")).click();
        }
    }
}
