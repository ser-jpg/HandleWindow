package rahul.everthig;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableColumnsStrategy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
       // driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();


        List<WebElement> firstColmlist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
       int count= firstColmlist.size();

        ArrayList<String> originalList=new ArrayList<String>();

        for (int i = 0; i <count ; i++) {

           originalList.add(firstColmlist.get(i).getText());

        }
        for(String os:originalList){

            System.out.println(os);
        }
        ArrayList<String> copiedList=new ArrayList<String>();

        for (int i = 0; i < originalList.size(); i++) {

            copiedList.add(originalList.get(i));

        }
        Collections.sort(copiedList);
        System.out.println("***********************original List***********************");
        for(String s:copiedList){

            System.out.println(s);
        }

        Assert.assertTrue(originalList.equals(copiedList));

    }
}
