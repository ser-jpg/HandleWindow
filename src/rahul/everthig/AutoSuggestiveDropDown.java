package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
        WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
        source.sendKeys("MUM");

        source.sendKeys(Keys.ARROW_DOWN);
        source.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
        destination.sendKeys("DEL");
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);


    }
}
