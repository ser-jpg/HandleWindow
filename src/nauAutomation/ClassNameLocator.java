package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        chromeInvacotion();
        driver.get("http://www.facebook.com");
        driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).click();
        Thread.sleep(2000);

       /* driver.findElement(By.id("u_0_f")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_f")).sendKeys("serkan");*/


    }

    public static void chromeInvacotion(){


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver=new ChromeDriver();
    }
}
