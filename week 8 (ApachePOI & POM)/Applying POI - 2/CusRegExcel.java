import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class CusRegExcel {     //DO NOT change the class name

      
    public static void writeExcelData() throws Exception  {         //DO NOT change the method signature
	    //Implement code to write the names 'John', 'Peter', 'Sam' to in the excel sheet on the first column
	    //As shown in the image
	    
	    XSSFWorkbook wb=new XSSFWorkbook();
	    XSSFSheet sheet=wb.createSheet("TestCase");
	    String names[]={"John","Peter","Sam"};
	    for(int i=0;i<1;i++){
	        XSSFRow row=sheet.createRow(i);
	        for(int j=0;j<names.length;j++){
	            XSSFCell cell=row.createCell(j);
	            cell.setCellValue(names[j]);
	        }
	    }
	    
	    File f=new File("CusReg.xlsx");
	    FileOutputStream os=new FileOutputStream("CustReg.xlsx");
	    
	    wb.write(os);
	    wb.close();
	    
    }
    public static void main(String[] args) throws Exception 
	{ 
	    CusRegExcel customer = new CusRegExcel();
	    customer.writeExcelData();
	    //Add required code
	}
}

  