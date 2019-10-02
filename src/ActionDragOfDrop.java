import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragOfDrop {
    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#credit2 > a")));
        WebElement source=driver.findElement(By.cssSelector("#credit2 > a"));
        WebElement target=driver.findElement(By.cssSelector("#shoppingCart1>h3"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).build().perform();
    }
}
