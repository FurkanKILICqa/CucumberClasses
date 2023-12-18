package utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    Workbook workbook;
    Sheet sheet;

    //Bu classtan object olusturmamizin amaci excel dosyasini okumaktir
    public ExcelReader(String dosyayolu,String sayfaIsmi){
        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
            workbook= WorkbookFactory.create(fis);
            sheet=workbook.getSheet(sayfaIsmi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
