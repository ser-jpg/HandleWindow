package SDETAutomation.headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        FirefoxOptions options=new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Title of page:"+driver.getTitle());

    }
}
