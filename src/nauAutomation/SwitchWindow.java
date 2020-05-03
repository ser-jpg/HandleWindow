package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {

    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("https://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
       Set<String> id=driver.getWindowHandles();
      Iterator<String> iterator =id.iterator();
      String parent=iterator.next();
      String child=iterator.next();

        driver.switchTo().window(parent);
        System.out.println("Parent title:"+driver.getTitle());
        driver.switchTo().window(child);
        System.out.println("Child title:"+driver.getTitle());


    }
}
