package rahul.everthig;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulAssignment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

       /*int checkBoxCount= driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(checkBoxCount);
        for (int i = 0; i <checkBoxCount ; i++) {
            Thread.sleep(200);

            driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();

        }
        for (int i = 0; i <checkBoxCount ; i++) {
            Thread.sleep(200);

            driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();

        }*/


// TODO Auto-generated method stub



            driver.findElement(By.cssSelector("input[type='checkbox']")).click();

            Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[type='checkbox']")).click();

            Assert.assertFalse(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());




    }
}
