package com.pokemon.server.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileExcel {
	public static List<Map<String, Object>> readFile(String path) {
		Workbook workbook = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		try {
			FileInputStream fis=new FileInputStream(new File(path.toString()));
			
			if(path.toString().endsWith("xlsx")){
				workbook = new XSSFWorkbook(fis);
			} else if(path.toString().endsWith("xls")){
				workbook=new HSSFWorkbook(fis);
			} else{
				fis.close();
				throw new IllegalArgumentException("The specified file is not Excel file");
			}
			Sheet sheet=workbook.getSheetAt(0);
			Iterator<Row> rows=sheet.iterator();
			// Pass header
			rows.next();
			
			while (rows.hasNext()) {
				Row row=rows.next();
				Iterator<Cell> cells=row.cellIterator();
				
				while (cells.hasNext()) {
					Cell cell = cells.next();
					
					switch (cell.getCellTypeEnum()) {
					case BLANK:
						break;
					case BOOLEAN:
						break;
					case ERROR:
						break;
					case FORMULA:
						break;
					case NUMERIC:
						break;
					case STRING:
						break;
					case _NONE:
						break;
					default:
						break;
					}
				}
			}
			workbook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}