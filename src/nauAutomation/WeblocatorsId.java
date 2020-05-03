package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeblocatorsId {

   static WebDriver driver;


    public static void main(String[] args) {
       FoxFire();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Dallas");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Istanbul");

    }

    public static void FoxFire(){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        driver=new FirefoxDriver();


    }
}
