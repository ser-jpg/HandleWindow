package nauAutomation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException {
       Browser browser=new Browser();
        WebDriver driver=browser.chromeInvacation();
        driver.get("http://www.amazon.com");
        /*TakesScreenshot src= (TakesScreenshot) driver;//Convert web driver object to TakeScreenshot
        src.getScreenshotAs(OutputType.FILE);//Call getScreenshotAs method to create image file
        File destFile=new File("C:\\TestCase\\mypicture2.bmp");// Copy file to Desired Location
        FileUtils.copyFile((File) src,FileUtils.openOutputStream(destFile));*/


        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\TestCase\\mypicture1.bmp"));

    }
}




