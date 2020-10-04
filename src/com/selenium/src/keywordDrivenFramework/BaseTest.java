package keywordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class BaseTest implements IAutoConstants{
    public static WebDriver driver;

    public void openBrowser() throws IOException {
        FileLib flib = new FileLib();
        String browserValue = flib.getPropertyKeyValue(PROPERTY_pATH, "browser");
        if(browserValue.equalsIgnoreCase("chrome")) {
            System.setProperty(CHROME_KEY, CHROME_VALUE);
            driver = new ChromeDriver();
        }
        else {
            System.out.println("Enter correct browser name");
        }
        String appUrl = flib.getPropertyKeyValue(PROPERTY_pATH, "url");
        driver.get(appUrl);
    }
    public void closeBrowser() {
        driver.quit();
    }

}
