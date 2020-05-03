package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulAssignment8Answer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("uni");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);



        JavascriptExecutor js = (JavascriptExecutor) driver;

        String state = "return document.getElementById(\"autocomplete\").value;";

        String stateExecute = (String) js.executeScript(state);

        System.out.println(stateExecute);


         int i=0;
        while (!stateExecute.equalsIgnoreCase("United Kingdom")) {

            i++;

            driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);

            stateExecute = (String) js.executeScript(state);

            System.out.println(stateExecute);



            if (i > 10) {



                break;

            }

        }

        if (i > 10) {



            System.out.println("Unitet Kingdom isn't found.");

        } else {



            System.out.println("Unitet Kingdom is found.");

        }



    }


}

