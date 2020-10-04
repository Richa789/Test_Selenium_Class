package dataDrivenFramework;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcel implements IAutoConstants {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("./data1/inputDataIntellij.xlsx");
//        Workbook wb = WorkbookFactory.create(fis);
//        Sheet sh = wb.getSheet("Sheet1");
//        Row r = sh.getRow(4);
//        Cell cellObj = r.getCell(2);
//        String excelValue = cellObj.getStringCellValue();
//        System.out.println(excelValue);
        // OPtimizing code
//        String value = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
//        System.out.println(value);
        // Optimizing more
//        System.out.println(WorkbookFactory.create(new FileInputStream("./data1/inputDataIntellij.xlsx")).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue());
        // Read multiple data
        FileLib flib = new FileLib();
        int rowCount = flib.getRowCount(EXCEL_PATH, "Sheet1");
        System.out.println(rowCount);
        for(int i = 0; i <= rowCount; i++) {
            flib = new FileLib();
            String excelValue = flib.getCellData(EXCEL_PATH, "Sheet1", i, 0);
            System.out.println(excelValue);
        }



    }
}


