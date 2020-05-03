package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calander {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#travel_date")).click();
      // grab common attribute

        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }



        List<WebElement> days=driver.findElements(By.cssSelector(".day"));

        int countDays=days.size();
        for (int i = 0; i <countDays ; i++) {

         String text= driver.findElements(By.cssSelector(".day")).get(i).getText();
         if(text.equalsIgnoreCase("28")){

             driver.findElements(By.cssSelector(".day")).get(i).click();
             break;

         }

        }

    }
}
