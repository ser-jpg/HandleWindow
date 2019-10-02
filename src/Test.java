import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver serkan=new ChromeDriver();

        serkan.get("https://amazon.com");


    }
}
