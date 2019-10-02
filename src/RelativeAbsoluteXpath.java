import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeAbsoluteXpath {


    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.expedia.com");
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");


    }
}
