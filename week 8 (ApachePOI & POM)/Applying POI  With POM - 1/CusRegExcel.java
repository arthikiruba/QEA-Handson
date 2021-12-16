import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.IOException;

public class CusRegExcel {         //Do not change the class name
	
	//Use this declaration to store values parsed from excel
    public static String[] customerData=new String[5];
    
    public static String[] readExcelData(String fileName) throws IOException{   //Do not change the method signature
    
        //Implement code to read data from excel file. Store the values in 'customerData' array. Return the array. */
        FileInputStream file=new FileInputStream(fileName);
        XSSFWorkbook wb=new XSSFWorkbook(file);
        XSSFSheet ws=wb.getSheet("customervalid");
        XSSFRow row=ws.getRow(0);
        for(int colNo=0;colNo<=4;colNo++)
        {
            customerData[colNo]=String.valueOf(row.getCell(colNo));
        }
        return customerData;

    }
    public static void getExcelPath(String sheetName)  {
        //Locate the excel sheet. Return the file path
        File inputFile=new File(sheetName);
        String path=inputFile.getAbsolutePath();
	}


}

  