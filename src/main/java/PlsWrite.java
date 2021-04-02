import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class PlsWrite {

	public static void main(String[] args) throws IOException {
		//Create workbook
		XSSFWorkbook wb = new XSSFWorkbook();

		//Creating Sheet
		XSSFSheet ws = wb.createSheet("data");
		
//		Row row4 = ws.createRow(3);
//		Cell cellC = row4.createCell(2);
		
		for(int i = 0; i<500; i++) {
			ws.createRow(i).createCell(3).setCellValue(RandomNumber.generate500Random()[i].toString());
		}
		
		ws.getRow(0).createCell(1).setCellValue("hi");
		
		String path = "C:\\Users\\gabri\\Downloads\\anxl.xlsx";
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		wb.close();
		fo.close();
	}
	
}
