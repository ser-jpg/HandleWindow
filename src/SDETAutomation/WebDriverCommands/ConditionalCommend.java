package SDETAutomation.WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ConditionalCommend {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        WebElement email=driver.findElement(By.xpath("// input[@id='email']"));
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));

        if(email.isDisplayed()&& email.isEnabled()){

            email.sendKeys("userkansen@gmail.com");
        }
        if(password.isDisplayed()&& password.isEnabled()){
            password.sendKeys("Serkan.3435");
        }

        int size=driver.findElements(By.xpath("// input[@name='sex']")).size();
        List<WebElement> elements=driver.findElements(By.xpath("// input[@name='sex']"));
        for (int i = 0; i <size ; i++) {
           if(elements.get(i).isSelected()==false){
               Thread.sleep(3000);
               elements.get(i).click();
           }
        }

    }
}
