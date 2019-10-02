import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckUrl1 {

     public static WebDriver driver;
     public static String url="https://www.amazon.com/";


    public static void main(String[] args) throws InterruptedException {

        // step3: print the result
        // step4: code review --> is ther a better code
        System.out.println(iscurrentUrlTrue(url));
    }

  // step1:invoke the browser
    public static void Foxfire(String url1){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(url);

    }
// step2: iscurrenturltrue with the requested
    public static boolean iscurrentUrlTrue(String url)throws InterruptedException{

        Foxfire(url);
        System.out.println("Sent URL:"+url);
        System.out.println("current URL:"+driver.getCurrentUrl());
        return driver.getCurrentUrl().equals(url);


    }
}
