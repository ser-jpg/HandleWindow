import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {

    public static void main(String[] args) throws InterruptedException {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();

        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        Select select=new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
        Thread.sleep(2000);
        select.selectByValue("b");
        select.selectByIndex(2);

    }
}
