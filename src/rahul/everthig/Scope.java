package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    // 1-Give me a count ling in the page
    // 2- count of footer section
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        int countLing = driver.findElements(By.tagName("a")).size();
        System.out.println(countLing);

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        int countFooterLink = footerDriver.findElements(By.tagName("a")).size();
        System.out.println(countFooterLink);

        //3-
       WebElement columnDriver= footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));

        System.out.println(columnDriver.findElements(By.tagName("a")).size());
        int countColumnLink=columnDriver.findElements(By.tagName("a")).size();
        for (int i = 1; i <countColumnLink ; i++) {

           String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(500);

        }// opens all the tab

        Set<String>abc= driver.getWindowHandles();
        Iterator<String>iterator=abc.iterator();
        while (iterator.hasNext()){

            driver.switchTo().window(iterator.next());
            System.out.println(driver.getTitle());
        }

        // click on the each ling in the column


    }
}
