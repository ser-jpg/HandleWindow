package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

// my requirement select 2 adult static drop down
public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();

        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        select.selectByValue("2");
       // select.selectByIndex(6);
        //select.selectByVisibleText("4");
        int element = driver.findElements(By.xpath("//option[contains(text(),'1')]")).size();
        for (int i = 0; i < element; i++) {

            driver.findElements(By.xpath("//option[contains(text(),'1')]")).get(i).click();

        }

    }
}
