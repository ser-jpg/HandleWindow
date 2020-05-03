package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultibleWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        System.out.println(driver.getTitle());

        Set<String> id = driver.getWindowHandles();

        Iterator<String> iterator = id.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        System.out.println(child);
      // driver.switchTo().window(parent);

       // System.out.println(driver.getTitle());




    }

}
