package rahul.everthig;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class QuestionsForCheckBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        List <WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
        int countElement=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        for (int i = 0; i <countElement ; i++) {

            elements.get(i).click();

        }


    }
}
