package actitime.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasklistpage {
	  @FindBy(xpath="//div[.='Add New']")
	  private WebElement addnewbtn;
	  
	  @FindBy(xpath="//div[@class='item createNewCustomer']")
	  private WebElement newcustomertbtn;
	  
	  @FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	  private WebElement customernametxtbx;
	  
	  @FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	  private WebElement descriptiontbx;
	  
	  @FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	  private WebElement selectcustomerdd;
	  
	  @FindBy(xpath="//div[.='vinay504' and@class='itemRow cpItemRow ']")
	  private WebElement vinay504;
	  
	  @FindBy(xpath="//div[text()='Create Customer']")
	  private WebElement createcustomerbtn;
	  
	  @FindBy(xpath="//div[@class='title' and text()='hdfc-001']")
	  private WebElement actualcustomercreated;
	  
	  public tasklistpage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }

	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	
	

	
	public WebElement getNewcustomertbtn() {
		return newcustomertbtn;
	}



	
	public WebElement getCustomernametxtbx() {
		return customernametxtbx;
	}

	
	public WebElement getDescriptiontbx() {
		return descriptiontbx;
	}

	
	public WebElement getSelectcustomerdd() {
		return selectcustomerdd;
	}

	
	public WebElement getVinay504() {
		return vinay504;
	}


	

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}


	
	public WebElement getActualcustomercreated() {
		return actualcustomercreated;
	}

	}
