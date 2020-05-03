package SDETAutomation.WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();

        String expectedTitle = "Find a Flight: Mercury Tours:";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
        }
        driver.close();
    }
}
