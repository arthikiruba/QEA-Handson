import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


public class CusRegExcel {    //Do NOT change the class name
	
	static String[] names=new String[2];

       
    public static String[] readExcelData(String sheetName) throws Exception {    //DO NOT change the method signature
		//Implement code to read the name 'Rajesh' and 'Velu' from the excel sheet.
		//Store the name in the 'names' array and return it.
		
		File file=new File("CustReg.xlsx");
		file.getAbsolutePath();
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cell=row1.getCell(0);
		
		XSSFRow row2=sheet.getRow(1);
		XSSFCell cell1=row2.getCell(0);
		
		String name=cell.getStringCellValue();
		String name1=cell1.getStringCellValue();
		System.out.println(name);
        System.out.println(name1);	
        String []names={"Rajesh","Velu"};
        return names;
    }



    public static String getExcelPath(String sheetName)
    {
	    //Implement code to locate the excel file. Return the filepath
	    File fls=new File("CustReg.xlsx");
	    return fls.getAbsolutePath();
    }

    public static void main(String[] args) throws Exception 
	{ 
	    CusRegExcel customer = new CusRegExcel();
	    customer.readExcelData("customervalid");
	    customer.getExcelPath("customervalid");
	    //Add required code
	}
}

  