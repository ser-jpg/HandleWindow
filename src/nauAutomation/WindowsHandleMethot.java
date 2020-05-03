package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandleMethot {
    public static void main(String[] args) {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("https://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        Set<String> id=driver.getWindowHandles();

        int i=0;
        for(String windowValue:id){

            i++;
            driver.switchTo().window(windowValue);
            System.out.println(i+".window value:"+driver.getTitle());
        }



    }
}
