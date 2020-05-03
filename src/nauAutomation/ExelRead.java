package nauAutomation;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ExelRead {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\TestCase\\TestCase1.xls");
        FileInputStream inputStream= new FileInputStream(file);
        Workbook workbook=new HSSFWorkbook(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        int rowCount=sheet.getLastRowNum();
        Row row;
        Cell cell;
        for (int i = 0; i <rowCount+1 ; i++) {

            row=sheet.getRow(i);
            cell=row.getCell(0);
            System.out.println(cell.getStringCellValue());

            
        }
    }
}
