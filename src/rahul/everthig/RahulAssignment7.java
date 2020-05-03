package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulAssignment7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        WebElement table=driver.findElement(By.cssSelector("#product"));
       int row2= table.findElements(By.xpath("//table[@id='product']/ tbody/tr[3]/td")).size();

        for (int j = 0; j <row2 ; j++) {
            String row2Text=table.findElements(By.xpath("//table[@id='product']/ tbody/tr[3]/td")).get(j).getText();
            System.out.print(row2Text);
        }

        int countRow=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
        System.out.println(countRow);

        for (int i = 0; i <countRow ; i++) {

            System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(i).getText());

        }


    }
}
