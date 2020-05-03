package SDETAutomation.WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");// open the url
        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().refresh();
        driver.close();
    }
}
