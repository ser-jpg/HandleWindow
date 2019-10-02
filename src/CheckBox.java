import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {



    Browser browser=new Browser();
    WebDriver driver=browser.chromeInvacation();
    driver.get("http://www.expedia.com");
    driver.findElement(By.cssSelector("#packageDirectFlight-hp-package")).click();
      Thread.sleep(2000);

        System.out.println("is selecteed"+driver.findElement(By.cssSelector("#packageDirectFlight-hp-package")).isSelected());
    }

}
