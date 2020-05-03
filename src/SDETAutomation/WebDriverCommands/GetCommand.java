package SDETAutomation.WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommand {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");// open the url
        System.out.println(driver.getTitle());// return title of page
        System.out.println(driver.getCurrentUrl());
       String textOFDate= driver.findElement(By.xpath("//b[contains(text(),'Mar 31, 2020')]")).getText();//
        System.out.println(textOFDate);
        driver.close();// close current browser and one window
        // driver.quit(); // closes multiple windows

    }
}
