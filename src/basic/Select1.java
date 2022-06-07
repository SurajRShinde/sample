package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import configurationPath.ConfigurationPath;

public class Select1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebdriverPath);
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9062095%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIsJb98Py19gIVjdeWCh0cGQCbEAAYASAAEgKFEPD_BwE");
		
		driver.manage().window().maximize();
		
		
	FileInputStream abc=new FileInputStream("C:\\Users\\Admin\\Desktop\\Software testing\\info.xlsx");
	
	 Sheet pqr = WorkbookFactory.create(abc).getSheet("Sheet2");
	 
	 String s = pqr.getRow(0).getCell(1).getStringCellValue();
	 String r = pqr.getRow(1).getCell(1).getStringCellValue();
	  long q = (long) pqr.getRow(2).getCell(1).getNumericCellValue();
	  String b= Long.toString(q);
	 String p = pqr.getRow(3).getCell(1).getStringCellValue();
	  System.out.println(s);
	  System.out.println(r);
	  System.out.println(q);
	  System.out.println(p);
	  WebElement Firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
	  Firstname.sendKeys(s);
	  Thread.sleep(2000);
	  WebElement Lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
	  Lastname.sendKeys(r);
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(b);
	  WebElement Password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	  Password.sendKeys(p);
	  WebElement a=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	  Select Day=new Select(a);
	  Day.selectByValue("19");
	  WebElement c= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	  Select Month=new Select(c);
	  Month.selectByValue("8");
	  WebElement d= driver.findElement(By.xpath("//select[@name='birthday_year']"));
	  Select Year=new Select(d);
	  Year.selectByValue("1993");
	  WebElement lll= driver.findElement(By.xpath("//label[text()='Male']"));
		lll.click();
	  Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
	 
	 Thread.sleep(5000);
	 
	 File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File screenshot= new File(ConfigurationPath.ScreenshotPath+"_.jpg");
	 
	 FileHandler.copy(screen, screenshot);
	  
	  
	  
		
	}

}
