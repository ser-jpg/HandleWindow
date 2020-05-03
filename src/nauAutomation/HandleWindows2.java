import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;
    /*
public class HandleWindows2 {

   /* public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.chromeInvacation();
        driver.get("https://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        int i=0;
        Set<String> id=driver.getWindowHandles();
        String parent="";
        String child="";

        for(String windowValue : id)
        {
            i++;
​
            if(i==1){
                parent=windowValue;
            }
            else
            {
                child=windowValue;
            }
​
            System.out.println(i+". windows title is:"+driver.getTitle());
        }
        System.out.println(parent);
        System.out.println(child);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().window(child);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Technologies']")).click();
        Thread.sleep(1000);
        driver.switchTo().window(parent);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
​
​
​
​
    }

}*/
