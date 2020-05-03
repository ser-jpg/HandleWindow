package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tekrar {
    public static void main(String[] args) throws InterruptedException {

        Browser browser = new Browser();
        WebDriver driver = browser.chromeInvacation();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("// a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@ value='MAA'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover")).click();





    }

}
