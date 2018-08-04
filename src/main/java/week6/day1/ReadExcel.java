package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	//@Test
	public Object readExcel(String fileName) throws IOException {
		XSSFWorkbook objWorkBook =new XSSFWorkbook("./TestCases/"+fileName+".xlsx");

		//XSSFSheet objSheet =objWorkBook.getSheet("Sheet1");
		XSSFSheet objSheet =objWorkBook.getSheetAt(0);

		int rowCount =objSheet.getLastRowNum();

		int ColumnCount=objSheet.getRow(0).getLastCellNum();

		Object[][] data= new Object[rowCount][ColumnCount] ;
		for(int i=1;i<=rowCount;i++) 
		{
			XSSFRow objRow = objSheet.getRow(i);
			for(int j =0;j< ColumnCount;j++)
			{
				try {
					XSSFCell objCell = objRow.getCell(j);

					data[i-1][j] = objCell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j] ="";
				}
				//System.out.println(data);
			}

		}

		objWorkBook.close();
		return data;

	}

}
