package Automation_SeleniumClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUps {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/5570/Desktop/Programs/Confirmation.html");
        Thread.sleep(3000);
        //HAndling alert pop-up
//        driver.findElement(By.xpath("//button[.='Login']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
        driver.findElement(By.xpath("//button[.=' I Love You ']")).click();
        Alert al = driver.switchTo().alert();
        Thread.sleep(3000);
        al.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.=' I Love You ']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        al.dismiss();
    }
}
