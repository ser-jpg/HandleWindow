package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddItemsAtToCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);
        String[] itemsNeeded = {"Cauliflower", "Brocolli", "Beans", "Carrot"};

        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button.promoBtn")));
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //explicit wait
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver,String[] itemsNeeded) {

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
            // we should covert array to arrayList

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formatedName = name[0].trim();
            List<String> needList = Arrays.asList(itemsNeeded);
            System.out.println(needList);
            if (needList.contains(formatedName)) {

                driver.findElements(By.cssSelector(".product-action")).get(i).click();
            }
        }


    }

}
