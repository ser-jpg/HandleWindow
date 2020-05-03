package nauAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IaaiSearch {

     static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        choremeInvocation();
        driver.get("http://www.iaai.com");
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys("lexus");
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys(Keys.ENTER);
        driver.navigate().to("http://www.amazon.com");
        System.out.println("text: "+driver.findElement(By.xpath("//*[@id='nav-orders']/span[2])")).getText());

//*[@id="nav-orders"]/span[2]
    }


    public static void choremeInvocation(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver=new ChromeDriver();
    }
}
