package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ActionsDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
        WebElement capital=driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        Actions actions=new Actions(driver);
        actions.moveToElement(capital).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        // moves to specific element
        actions.moveToElement(move).build().perform();
        actions.moveToElement(move).contextClick().build().perform();



    }

}
