package _5_Parameterization;

import _1_CoreSelenium._1_BaseCode;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _9_ReadExcelData extends _1_BaseCode {

	/*Methods:-  1.create  2.getSheet  3.getRow  4.getCell  5.getCellStringValue  6.getNumericCellValue */

	public static String path = "D:\\IJ-PROJECTS\\Selenium with Java\\src\\_5_Parameterization\\employee_data.xlsx";
	public static void main(String[] args) throws IOException {

		/*readExcelData(path);*/
		readAllDataFromExcel(path);
	}

	public static void readExcelData(String path) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");

		String x = excelFile.getRow(0).getCell(0).getStringCellValue();
		System.out.println(x);
		int y = (int) excelFile.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(y);


	}

	public static void readAllDataFromExcel(String path) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");

		for(Row row : excelSheet){
			for(Cell cell : row){
				switch (cell.getCellType()){
					case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("Unknown Type\t");
                        break;
				}
			}
			System.out.println();

		}

	file.close();
	}

	public static void automateRegisterFromUsingExcelFileData(String path) throws IOException {
		baseCode("https://m.rediff.com/signup/register");
		FileInputStream file = new FileInputStream(path);
		Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet2");

	}

}
