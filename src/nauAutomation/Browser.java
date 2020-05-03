package nauAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {


    public WebDriver chromeInvacation(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    public WebDriver fireFoxInvacation(){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        return driver;
    }
}
