package rahul.everthig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabelExercises {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr"));
       int sum=0;
        int rows = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();

        for (int i = 0; i < count - 2; i++) {

            String value = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
           int valueInteger=Integer.parseInt(value);
           sum=sum+valueInteger;
        }
        //System.out.println(sum);

       String extrasValue= table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
       int extras=Integer.parseInt(extrasValue);
       int totalSum=sum+extras;
        System.out.println(totalSum);

       String actual= table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

          int actualValue= Integer.parseInt(actual);
          if(totalSum==actualValue){

              System.out.println("Count matches");
          }
          else{
              System.out.println("count fails");
          }

    }
}
