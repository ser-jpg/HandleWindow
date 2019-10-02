import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFuctions {

    public static void main(String args[]){


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("The title of the web page is :"+driver.getTitle());
        driver.navigate().to("http://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("****************************************************");
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
