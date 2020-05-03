package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulAsignment5 {
    public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://the-internet.herokuapp.com/");
         driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        //driver.switchTo().frame("frame-middle"); bu iki yolda kullanilabilir.
        System.out.println(driver.findElement(By.id("content")).getText());


    }
}
