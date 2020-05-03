package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RahulAssignment2 {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.cleartrip.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#FromTag")));
            driver.findElement(By.cssSelector("#FromTag")).sendKeys("New York");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#FromTag")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#FromTag")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#ToTag")).sendKeys("Houston");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#ToTag")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#ToTag")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("(//a[text()='27'])[1]")).click();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
