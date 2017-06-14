package utility;
<<<<<<< HEAD

import java.io.FileInputStream;

import java.io.FileOutputStream;
=======
import java.io.FileInputStream;
	 
    import java.io.FileOutputStream;
>>>>>>> e645053d56796db0d51cad098f3d0713995ded13

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;

<<<<<<< HEAD
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

=======
	import org.apache.poi.xssf.usermodel.XSSFRow;

	import org.apache.poi.xssf.usermodel.XSSFSheet;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
public class ExcelUtils {
	

	private static XSSFSheet ExcelWSheet;
	 
>>>>>>> e645053d56796db0d51cad098f3d0713995ded13
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
<<<<<<< HEAD

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file
=======
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		 
			try {

   			// Open the Excel file
>>>>>>> e645053d56796db0d51cad098f3d0713995ded13

			FileInputStream ExcelFile = new FileInputStream("/Users/Documents/priya/TestData.xlsx");

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet("Sheet1");

<<<<<<< HEAD
		} catch (Exception e) {

			throw (e);
		}

	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		// TODO Auto-generated method stub
		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}
}
=======
			} catch (Exception e){

				throw (e);
			}

			}
	
			
	       			public static void setCellData(String Result,int RowNum,int ColNum) throws Exception{
	       			 
	           			try{
	     
	              			Row  = ExcelWSheet.getRow(RowNum);
	     
	    					Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
	     
	    					if (Cell == null) {
	     
	    						Cell = Row.createCell(ColNum);
	     
	    						Cell.setCellValue(Result);
	     
	    						} else {
	     
	    							Cell.setCellValue(Result);
	     
	    						}
	    					FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData);
	    					 
	          				ExcelWBook.write(fileOut);
	 
	          				fileOut.flush();
	 
	 						fileOut.close();
	 
							}catch(Exception e){
	 
								throw (e);
	 
						}
	 
					}
	 

	
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		// TODO Auto-generated method stub
		try{
			 
  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

  			String CellData = Cell.getStringCellValue();

  			return CellData;

  			}catch (Exception e){

				return"";

	}

	}
	}
>>>>>>> e645053d56796db0d51cad098f3d0713995ded13
