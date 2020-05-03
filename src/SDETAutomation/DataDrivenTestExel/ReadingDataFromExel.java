package SDETAutomation.DataDrivenTestExel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExel {

    public static void main(String[] args) throws IOException {
        String file="C://DataDrivenTest//demodate.xlsx";

        FileInputStream fis=new FileInputStream(file);

        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("testdata"); // providing sheet name
      //  XSSFSheet sheet1=workbook.getSheetAt(0); // providing sheet index

       int rowCont= sheet.getLastRowNum();
       int columnCount=sheet.getRow(0).getLastCellNum(); // cell number

        for (int i = 0; i <rowCont ; i++) {
          XSSFRow currentRow=  sheet.getRow(i);
            for (int j = 0; j <columnCount ; j++) {
               String value= currentRow.getCell(j).toString();
                System.out.print(" | "+value);
            }
            System.out.println();

        }


    }

}
