package actitime.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actitime.com.generic.baseclass;

public class entertimetrackpage extends baseclass{
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasktab;
	
	@FindBy(id="logoutLink")
	private WebElement logout;

	
	public entertimetrackpage(WebDriver driver) {
	PageFactory.initElements( driver,this);

}
	
public void settasktab() { 
	tasktab.click();
}
public void setlogout() {
	logout.click();
}
}