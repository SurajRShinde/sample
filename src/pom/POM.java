package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	// Declaration
		@FindBy(xpath="//input[@type='text']") private WebElement L_Name;
		@FindBy(xpath="//input[@type='password']") private WebElement Password;
		@FindBy(xpath="//button[@name='login]") private WebElement L_button;
		
		//Initialization
		POM(WebDriver ddd){
			PageFactory.initElements(ddd, this);		
		}

		//Usage	
		public void enterL_Name(String name) {
			L_Name.sendKeys(name); }
			
		public void enter_Password(String Pass) {
			Password.sendKeys(Pass);
		}
		public void button(){
			L_button.click();
		}


}
