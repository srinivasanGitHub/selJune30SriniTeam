package week6.homework;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readingExceldata {
	@Test
	public void readingExcelSheetData() throws IOException
	{
		try
		{
			XSSFWorkbook objWb = new XSSFWorkbook("G:\\Automation Testing\\Daily Questions\\MergeLead.xlsx");
			XSSFSheet objSheet = objWb.getSheetAt(0);

			int lastRowNum = objSheet.getLastRowNum();
			int lastCellNum = objSheet.getRow(0).getLastCellNum();
			System.out.println(lastRowNum);
			System.out.println(lastCellNum);
			for(int i=1;i<=lastRowNum;i++)
			{
				XSSFRow objRow = objSheet.getRow(i);
				for(int j=0;j<lastCellNum;j++)
				{
					XSSFCell objCell= objRow.getCell(j);
					//@SuppressWarnings("deprecation")
					//int type =objCell.getCellType();
					//System.out.println(type);
					
					String type="";
					if (objCell!=null) {
						/*String val =objCell.getRawValue();
										System.out.println(val);*/
						//System.out.println(String.valueOf(objCell.getCellTypeEnum()));
						type = String.valueOf(objCell.getCellTypeEnum());
						if (type != "BLANK" || type != "null") {
							if (type == "NUMERIC") {
								System.out.println("Excel Data:" + objCell.getNumericCellValue());
							} else if (type == "STRING") {
								System.out.println("Excel Data:" + objCell.getStringCellValue());
							}
						} 
					}
				}
			}
		}
		catch (Exception e) 
		{
			System.err.println("Exception when reading data from excel :"+e);
		}

	}
}

	




