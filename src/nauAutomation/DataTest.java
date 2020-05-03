package nauAutomation;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class DataTest {
    public static void main(String[] args) throws IOException, InterruptedException {//  Bir veri okumak istediğimizde InputStream,
                                                               // bir veri yazmak istediğimizde de OutputStream sınıfını kullanırız.File file=new File("C:\\") ;                                                     // outputstrem Java’daki çıkış işlemlerini sağlar.
        File file=new File("C:\\TestCase\\TestCase1.xls");          //inputstream Byte dizilerinin ya da byte’ların tek tek okunmasını sağlar.File file =new File("Desktop");
        FileInputStream fileInputStream=new FileInputStream(file);
        Workbook workbook=new HSSFWorkbook(fileInputStream);//xlsx formatındaki dosyaları okumak/yazmak için kullanılıyor
         Sheet sheet=workbook.getSheet("Sheet2");

         Browser browser=new Browser();
         WebDriver driver=browser.chromeInvacation();
         driver.get("http://www.facebook.com");

         int totalRow=sheet.getLastRowNum();
        for (int i = 1; i <totalRow ; i++) {

            Row row=sheet.getRow(i);
            Cell userName=row.getCell(0);
            Cell password=row.getCell(1);
            driver.findElement(By.id("email")).sendKeys(userName.getStringCellValue());
            Thread.sleep(1000);
            driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
            Cell result=row.getCell(2);
            result.setCellValue("passed");
            fileInputStream.close();
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            workbook.write(fileOutputStream);
            fileOutputStream.close();


        }




    }
}
