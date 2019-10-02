import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryCssSelector {

    public static void main(String[] args) {

        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();

        driver.get("http://www.facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("serkan");
    }
}
