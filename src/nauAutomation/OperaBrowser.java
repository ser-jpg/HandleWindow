package nauAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser {
    static WebDriver driver;
    public static void main(String[] args) {

        invokeOpera();
        driver.get("http://www.facebook.com");




    }
    public static void invokeOpera(){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\operadriver_win64.zip\\operadriver.exe");
         driver=new OperaDriver();
    }
}
