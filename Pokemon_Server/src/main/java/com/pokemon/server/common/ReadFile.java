package com.pokemon.server.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadFile {

	public static void readFileExcel2003Format(final String excelFilePath){
		try {
			FileInputStream fis=new FileInputStream(new File(excelFilePath));
			HSSFWorkbook workbook=new HSSFWorkbook(fis);
			HSSFSheet sheet=workbook.getSheetAt(0);
			Iterator<Row> rows=sheet.iterator();
			
			while (rows.hasNext()) {
				Row row=rows.next();
				Iterator<Cell> cells=row.cellIterator();
				
				while (cells.hasNext()) {
					Cell cell = cells.next();
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}