package Automation_SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingNewWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.quit();
//        Set<String> allWindows = driver.getWindowHandles();
//        System.out.println("Total number of windows are " + allWindows.size());
//        for(String windowHandle : allWindows) {
//            driver.switchTo().window(windowHandle);
//            driver.close();
//        }
        String wh = driver.getWindowHandle();
        System.out.println("Session ID is " + wh);

//        Set<String> allWh = driver.getWindowHandles();
//        for(String winHand : allWh) {
//            String title = driver.switchTo().window(winHand).getTitle();
//            if(title.equals("Amazon")) {
//                driver.manage().window().maximize();
//                Thread.sleep(2000);
//                driver.close();
//            }
//
//            }
        String parentTitle = driver.getTitle();
        System.out.println("Parent title is " + parentTitle);
        Set<String> allWind = driver.getWindowHandles();
        for(String obj : allWind) {
            String title = driver.switchTo().window(obj).getTitle();
            if(!title.equals(parentTitle)) {
                driver.close();
            }
        }


        }
}

