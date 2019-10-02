import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        /*Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();*/
        int count=driver.findElements(By.cssSelector("input[type='radio']")).size();
        System.out.println(count);
        for(int i=0;i<count;i++){

            driver.findElements(By.cssSelector("input[type='radio]")).get(i).click();
            Thread.sleep(2000);
        }
    }
}
