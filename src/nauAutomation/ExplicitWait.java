package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.expedia.com");
        // set the timeout explicitwait
        WebDriverWait dr=new WebDriverWait(driver,20);
        dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        // click hotel button
        dr.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#tab-hotel-tab-hp"))));
        driver.findElement(By.id("tab-hotel-tab-hp")).click();
        // click the Bundleab-pa\n"
        dr.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#tab-package-tab-hp"))));
        driver.findElement(By.id("tab-package-tab-hp")).click();
        dr.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("tab-package-tab-hp"))));
        


    }



}
