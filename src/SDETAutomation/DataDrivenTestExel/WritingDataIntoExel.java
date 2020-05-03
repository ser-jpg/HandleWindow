package SDETAutomation.DataDrivenTestExel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExel {

    public static void main(String[] args) throws IOException {
        String file = "C://DataDrivenTest//dataProje.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet=workbook.getSheet("Sheet1");


     // int row=  sheet.getLastRowNum();

        for (int i = 0; i <4 ; i++) {

            XSSFRow xssfRow=sheet.getRow(i);

            xssfRow.createCell(5).setCellValue("pass");
        }

        workbook.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println(" hadi bakalim");





    }
}
