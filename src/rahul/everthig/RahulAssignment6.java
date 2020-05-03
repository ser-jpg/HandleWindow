package rahul.everthig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulAssignment6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.cssSelector("#checkBoxOption2")).click();

        Select select=new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));

        select.selectByIndex(2);
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#name")).sendKeys("Option2");
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        //Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }
}
