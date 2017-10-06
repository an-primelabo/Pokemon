package com.pokemon.server.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pokemon.server.constant.Constants;

public class ReadDataFiles {
	private static final String INSERT_QUERY = "INSERT INTO ";
	private static final String VALUES_QUERY = "VALUES";

	public static void readDataFiles() {
		File directory = new File(Constants.PATH_FOLDER_DATA);
		File[] files = directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("xlsx");
			}
		});

		for (File file : files) {
			String fileName = FilenameUtils.getBaseName(file.getName());
			String script = parseToInsertScript(file.getAbsolutePath(), fileName);

			if (!script.equals(Constants.BLANK)) {
				writeScriptToFile(Constants.PATH_FOLDER_SQL + fileName + ".sql", script);
			}
		}
	}

	public static String parseToInsertScript(final String excelFilePath, final String fileName) {
		StringBuffer sql = new StringBuffer(INSERT_QUERY);
		FileInputStream fis = null;
		Workbook workbook = null;

		try {
			System.out.println(fileName + ": Reading...");

			sql.append(fileName).append(" ");
			fis = new FileInputStream(new File(excelFilePath));
			workbook = new XSSFWorkbook(fis);

			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();
			int lastColumn = sheet.getRow(0).getLastCellNum();

			if (sheet.getLastRowNum() == 0) {
				fis.close();
				workbook.close();

				return Constants.BLANK;
			}
			while (rows.hasNext()) {
				Row row = rows.next();
				sql.append("(");

				for (int i = 0; i < lastColumn; i++) {
					Cell cell = row.getCell(i);

					if (cell != null) {
						CellType cellType = cell.getCellTypeEnum();

						switch (cellType) {
						case BOOLEAN:
							sql.append(cell.getBooleanCellValue());
							break;
						case NUMERIC:
							sql.append((int) cell.getNumericCellValue());
							break;
						case STRING:
							if (row.getRowNum() == 0) {
								sql.append(cell.getStringCellValue());
							} else {
								if (cell.getStringCellValue().equalsIgnoreCase(Constants.TRUE) ||
									cell.getStringCellValue().equalsIgnoreCase(Constants.FALSE)) {
									sql.append(cell.getStringCellValue().toLowerCase());
								} else {
									sql.append("'" + cell.getStringCellValue() + "'");
								}
							}
							break;
						default:
							break;
						}
					} else {
						sql.append(Constants.NULL);
					}
					sql.append(", ");
				}
				sql.delete(sql.length() - 2, sql.length());

				if (row.getRowNum() == 0) {
					sql.append(") ").append(VALUES_QUERY).append("\n");
				} else {
					sql.append("),\n");
				}
			}
			sql.replace(sql.length() - 2, sql.length(), ";");

			System.out.println(fileName + ": Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sql.toString();
	}

	public static void writeScriptToFile(final String sqlFilePath, final String content) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			System.out.println(sqlFilePath + ": Writing...");

			fw = new FileWriter(sqlFilePath);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println(sqlFilePath + ": Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}