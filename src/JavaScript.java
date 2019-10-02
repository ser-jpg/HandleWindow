import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {

    public static void main(String[] args) throws InterruptedException{
        Browser browser = new Browser();
        WebDriver driver = browser.chromeInvacation();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[type='button']")).click();
         String expectedValue="Are you sure you want to give us the deed to your house?";
         Thread.sleep(2000);

         if(expectedValue.equals("Are you sure you want to give us the deed to your house?")){

             Thread.sleep(2000);
             driver.switchTo().alert().accept();
         }

    }
}
