package nauAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {

    public static void main(String[] args) {
        chrome();
        firefox();


    }
    public static void firefox(){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.ebay.com/");
    }
    public static void chrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver serkan=new ChromeDriver();

        serkan.get("https://amazon.com");

    }
}
