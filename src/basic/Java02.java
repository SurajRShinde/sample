package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java02 {	
	
	public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Software testing\\\\Crome browser\\\\chromedriver.exe");
    
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement abc= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	abc.click();
	Thread.sleep(3000);
	
	WebElement xyz= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	Select s = new Select(xyz);
	
	s.selectByValue("5");
	s.selectByIndex(2);
	//s.selectByVisibleText("Aug");
	//WebElement pqr= driver.findElement(By.xpath("//label[@class='_58mt']"));
	//pqr.click();
	
	
	
}


}
