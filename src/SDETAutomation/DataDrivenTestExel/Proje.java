package SDETAutomation.DataDrivenTestExel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Proje {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

        String file = "C://DataDrivenTest//dataProje.xlsx";

        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getLastRowNum();
        int cellCount = sheet.getRow(0).getLastCellNum();

        System.out.println("rowCount:" + rowCount);
        System.out.println("cellCount:" + cellCount);

        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);

            WebElement pricible=driver.findElement(By.xpath("//input[@id='principal']"));
            WebElement rate=driver.findElement(By.xpath("//input[@id='interest']"));
            WebElement period=driver.findElement(By.xpath("//input[@id='tenure']"));
            WebElement calculated=driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]"));
            WebElement frequency=driver.findElement(By.xpath("//select[@id='frequency']"));
            WebElement maturity=driver.findElement(By.xpath("//span[@id='resp_matval']"));
            WebElement periodCombo=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
            WebElement maturityValue=driver.findElement(By.xpath("//*[@id='resp_matval']//strong"));
            WebElement clear= driver.findElement(By.xpath("//img[@class='PL5']"));

              int princ=(int)  row.getCell(0).getNumericCellValue();
              int rateInt=(int)row.getCell(1).getNumericCellValue();
              int per=(int)row.getCell(2).getNumericCellValue();
              String freq= row.getCell(3).getStringCellValue();
              int expMaturity=(int)row.getCell(4).getNumericCellValue();

              pricible.sendKeys(String.valueOf(princ));
              rate.sendKeys(String.valueOf(rateInt));
              period.sendKeys(String.valueOf(per));

              Select select=new Select(periodCombo);
              select.selectByVisibleText("year(s)");

              Select select1=new Select(frequency);
              select1.selectByIndex(0);

              calculated.click();
             String actualValue= maturity.getText();

            System.out.println(actualValue);

             if(Double.parseDouble(actualValue)==expMaturity){

                 System.out.println("Test Past");
             }
             else{
                 System.out.println("Test Failed");
             }

             clear.click();





        }
        driver.close();
        driver.quit();

    }
}
