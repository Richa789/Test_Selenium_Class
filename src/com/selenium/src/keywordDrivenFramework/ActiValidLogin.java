package keywordDrivenFramework;

import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ActiValidLogin extends BaseTest{
    public static void main(String[] args) throws IOException, InterruptedException {
        BaseTest bt = new BaseTest();
        bt.openBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        FileLib flib = new FileLib();
        driver.findElement(By.id("username")).sendKeys(flib.getPropertyKeyValue(PROPERTY_pATH, "username"));
        Thread.sleep(2000);
        driver.findElement(By.name("pwd")).sendKeys(flib.getPropertyKeyValue(PROPERTY_pATH, "password"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Login ']")).click();
    }
}
