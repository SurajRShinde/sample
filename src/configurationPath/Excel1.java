package configurationPath;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream abc = new FileInputStream("C:\\Users\\Admin\\Desktop\\Software testing\\yede.xlsx");
		
		 Sheet pqr = WorkbookFactory.create(abc).getSheet("Sheet1");
		
		for(int i=0; i<=13; i++) {
			
			for(int j=0; j<=3; j++) {
		 
		 String s = pqr.getRow(i).getCell(j).getStringCellValue();
		
		System.out.println(s);}
		
	}

}

}
