import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PositiveTicketCase {

    public static void main(String[] args) throws InterruptedException {

        Browser browser = new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.flypgs.com");
         driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[1]/div[1]/div/div[2]/div/label")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[2]/div[1]/div/span/span[1]/span")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).sendKeys("Istanbul Airport");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ENTER);






       /* WebDriver driver=browser.fireFoxInvacation();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[1]/div/label[2]/span")).click();
    }

        */
    }
}
