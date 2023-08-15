package actitime.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgnbtn;
	
	public loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	public void login(String un,String pwd) { 
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgnbtn.click();
	}

}
