package rahul.everthig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLSertification {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ;
        // TODO Auto-generated method stub

//SSl certificates

//Desired capabilities=
//general chrome profile
        DesiredCapabilities ch=DesiredCapabilities.chrome();
//ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver(c);




    }

}
