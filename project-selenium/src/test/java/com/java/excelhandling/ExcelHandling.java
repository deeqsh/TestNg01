package com.java.excelhandling;

		
    	import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.Iterator;
		import org.apache.poi.sl.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		import java.io.FileOutputStream;
		import java.util.Map;
		import java.util.Set;
		import java.util.TreeMap;
		
		public class ExcelHandling {
			
			String filePath="/Users/piyush/Documents/";
			public static void main(String args[]) throws IOException {
				
				ExcelHandling excelHandle=new ExcelHandling();
				excelHandle.readExcelFile();
				excelHandle.writeDataIntoExcelFiele();
			}
			public void readExcelFile() throws IOException {
				FileInputStream fis = new FileInputStream(new File(filePath+"ExelExample.xlsx"));
				 
				//creating Workbook instance that refers to .xlsx file
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
				
				Iterator<Row> itr = sheet.iterator();    //iterating over excel file
				while (itr.hasNext())
				{
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
				while (cellIterator.hasNext())
				{
				Cell cell = cellIterator.next();
				switch (cell.getCellType())
				{
					case Cell.CELL_TYPE_STRING:    //field that represents string cell type
						System.out.print(cell.getStringCellValue() + "\t\t\t");
						break;
				case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type
						System.out.print(cell.getNumericCellValue() + "\t\t\t");
						break;
				default:
				}
					
				}
					System.out.println("");
				}
			
			}
			public void writeDataIntoExcelFiele() throws IOException{
				        // workbook object
				        XSSFWorkbook workbook = new XSSFWorkbook();
				 
				        // spreadsheet object
				        XSSFSheet spreadsheet
				            = workbook.createSheet(" Student Data ");
				 
				        // creating a row object
				        XSSFRow row;
				 
				        // This data needs to be written (Object[])
				        Map<String, Object[]> studentData
				            = new TreeMap<String, Object[]>();
				 
				        studentData.put("1",new Object[] { "Roll No", "NAME", "Year" });
				 
				        studentData.put("2", new Object[] { "128", "Aditya", "2nd year" });
				 
				        studentData.put("3",new Object[] { "129", "Narayana", "2nd year" });
				 
				        studentData.put("4", new Object[] { "130", "Mohan","2nd year" });
				 
				        studentData.put("5", new Object[] { "131", "Radha","2nd year" });
				 
				        studentData.put("6", new Object[] { "132", "Gopal","2nd year" });
				 
				        Set<String> keyid = studentData.keySet();
				 
				        int rowid = 0;
				 
				        // writing the data into the sheets...
				 
				        for (String key : keyid) {
				 
				            row = spreadsheet.createRow(rowid++);
				            Object[] objectArr = studentData.get(key);
				            int cellid = 0;
				 
				            for (Object obj : objectArr) {
				                Cell cell = row.createCell(cellid++);
				                cell.setCellValue((String)obj);
				            }
				        }
				        FileOutputStream out = new FileOutputStream(
				            new File("/Users/piyush/eclipse-workspace/seleniumproject/project-selenium/src/test/java/com/Data/WriteData.xlsx"));
				 
				        workbook.write(out);
				        out.close();
				    }
			
		
	}


