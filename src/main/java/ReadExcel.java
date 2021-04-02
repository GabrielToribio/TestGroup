import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\gabri\\Downloads\\anxl.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);
		
		Row row0 = ws.getRow(0);
		Cell cellD1 = row0.getCell(3);
		
		System.out.println(cellD1);
		System.out.println(wb.getSheetAt(0).getRow(5).getCell(3));

		fi.close();

	}

}
