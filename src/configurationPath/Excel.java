package configurationPath;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream excelfile= new FileInputStream("C:\\Users\\Admin\\Desktop\\Software testing\\abc.xlsx");
	
		
		String abc = WorkbookFactory.create(excelfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(abc);
	}

}
