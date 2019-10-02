import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ActionMouseClass {


    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.amazon.com");
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("twotabsearchtextbox"))));


        Actions action=new Actions(driver);



    }
}
