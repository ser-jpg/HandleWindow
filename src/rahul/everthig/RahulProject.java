package rahul.everthig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RahulProject {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.cleartrip.com/");
        try {
            driver.findElement(By.cssSelector("#FromTag")).sendKeys("New");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#FromTag")).sendKeys(Keys.ARROW_DOWN);
            driver.findElement(By.cssSelector("#FromTag")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("#ToTag")).sendKeys("Houston");
            driver.findElement(By.cssSelector("#ToTag")).sendKeys(Keys.ENTER);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
