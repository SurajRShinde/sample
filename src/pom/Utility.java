package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import configurationPath.ConfigurationPath;

public class Utility {
WebDriver driver;
	
	public String ReadExcelData(int a,int b) throws EncryptedDocumentException, IOException {
		FileInputStream gg= new FileInputStream("C:\\Users\\Admin\\Desktop\\Software testing\\Book1.xlsx");
	    Sheet val = WorkbookFactory.create(gg).getSheet("Sheet1");
	    String item = val.getRow(a).getCell(b).getStringCellValue();
		return item;
	}
	//public String ExcelData(int a,int b) throws IOException {
		//FileInputStream abc= new FileInputStream("C:\\Users\\Admin\\Desktop\\Software testing\\Book1.xlsx");
		// Sheet item2 = WorkbookFactory.create(abc).getSheet("Sheet2");
	//	return null;
	    
		//}
public void Screenshoot() throws IOException{
Base abc=new Base();
	abc.driverInit();
	driver=new ChromeDriver();
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File brc=new File(ConfigurationPath.ScreenshotPath);
	FileHandler.copy(src, brc);
}

}
