import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterAction {

    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions actions=new Actions(driver);
        WebElement webElement=driver.findElement(By.id("email"));
        //actions.moveToElement(webElement).build().perform();
        //actions.click().build().perform();
        actions.keyDown(webElement,Keys.SHIFT).build().perform();
        actions.sendKeys("ibrahim").build().perform();
        //actions.keyUp(webElement,Keys.SHIFT).build().perform();





    }
}
