package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaAlert {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        String text="Rahul";
        driver.findElement(By.cssSelector("#name")).sendKeys(text);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }
}
