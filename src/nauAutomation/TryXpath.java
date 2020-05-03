package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXpath {

    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver= browser.chromeInvacation();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")).click();

    }
}
