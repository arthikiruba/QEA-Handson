import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class CargoShipping   //DO NOT change the class name
{
	
    
    public static void writeExcelData(String fileName,String result) throws Exception { //Do not change the method signature
        //Write the Test result to the excel sheet
        XSSFWorkbook w=new XSSFWorkbook();
        XSSFSheet s=w.createSheet("TestCase");
        XSSFRow r=s.createRow(0);
        XSSFCell c=r.createCell(0);
        c.setCellValue(result);
        FileOutputStream os=new FileOutputStream(fileName);
        w.write(os);
    }
    
}

  