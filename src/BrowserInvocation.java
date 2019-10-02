import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvocation {
    public static void main(){

        Chrome();
        Foxfire();



    }
    // this method will invoke the chrome browser.
    //Creadted by: Serkan
    //Last midified by: Serkan Sen
    public static void Chrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
    public static void Foxfire(){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
    }


}
