package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0); // bu da ikinci yol tek frame old icin.
        driver.manage().window().maximize();
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        //WebDriverWait wait=new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.demo-frame")));
        Actions actions=new Actions(driver);
        WebElement search= driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        actions.dragAndDrop(search,target).build().perform();
        driver.switchTo().defaultContent();// eher frame disina cikmak istiyorsan bunu yapmalisin.

    }
}
