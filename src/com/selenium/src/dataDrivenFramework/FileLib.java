package dataDrivenFramework;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileLib {
    public String getCellData(String excelPath, String sheetName, int row, int cell ) throws IOException {
        FileInputStream fis = new FileInputStream(excelPath);
        Workbook wb = WorkbookFactory.create(fis);
        String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
        return value;
    }
    public int getRowCount(String excelPath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(excelPath);
        Workbook wb = WorkbookFactory.create(fis);
        int rowCount = wb.getSheet(sheetName).getLastRowNum();
        return rowCount;


    }
}
