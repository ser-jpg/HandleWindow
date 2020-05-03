package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {

    public static void main(String[] args) throws InterruptedException {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();

        driver.get("http://www.expedia.com");
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(2000);

        for(int i=0;i<3;i++){
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);

        }
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#package-destination-hp-package")).sendKeys("Las Vegas");
        driver.findElement(By.cssSelector("#package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("#package-destination-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#package-departing-hp-package")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#package-departing-hp-package")).sendKeys("10/10/2019");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#package-returning-hp-package[autocomplete]")).sendKeys("11/11/2019");
        driver.findElement(By.cssSelector("check gcw-package-direct-flight non-stop-and-refundable-check-boxes-in-high-contrast-mode")).click();
        Thread.sleep(2000);


    }
}
