package nauAutomation;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PaneInformation;

import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExelWrite {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\TestCase\\TestCase1.xls");
        FileInputStream fileInputStream=new FileInputStream(file);
        Workbook workbook=new HSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.createCell(0,CellType.STRING);
        cell.setCellValue("Serkan");
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("Serkan");


    }
}
