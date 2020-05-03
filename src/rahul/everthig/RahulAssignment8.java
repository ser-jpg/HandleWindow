package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class RahulAssignment8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);

        System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));


    }
}
