import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {
    public static String url="https://www.amazon.com/";

    public static WebDriver driver;

    public static void main(String[] args) {
        chrome(url);
        boolean result=validationUrl(url);
        System.out.println("Validation:"+result);
    }


    // invokes the chrome browser
    public static void chrome( String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get(url);
    }

    public static boolean validationUrl(String url){

        System.out.println("Current Url: "+driver.getCurrentUrl());
        System.out.println("Requested Url: "+url);

        if(url.equals(driver.getCurrentUrl())){

            return true;

        }
        else{
            return false;
        }




    }


}
