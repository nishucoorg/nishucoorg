package actitime.com.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.com.generic.baseclass;
import actitime.com.generic.filelib;
import actitime.com.pom.entertimetrackpage;
import actitime.com.pom.tasklistpage;

	@Listeners(actitime.com.generic.listnerimplimentation.class)
	
	public class customermodule extends baseclass{
		@Test
		public void testcreatecustomer() throws IOException {
			filelib f=new filelib();
			String customername = f.getexceldata("sheet1", 1, 3);
			String customerdescription=f.getexceldata("sheet1", 1, 2);
			Reporter.log("createcustomer",true);
			
			entertimetrackpage e=new entertimetrackpage(driver);
			e.settasktab(); 
			
			tasklistpage t= new tasklistpage(driver);
			t.getAddnewbtn().click();
			t.getNewcustomertbtn().click();
			t.getCustomernametxtbx().sendKeys(customername);
		    t.getDescriptiontbx().sendKeys(customerdescription);
		    t.getSelectcustomerdd().click();
		    t.getVinay504().click();
		    t.getCreatecustomerbtn().click();
		    
		    
		    
	String actualtext = t.getActualcustomercreated().getText();
	Assert.assertEquals(actualtext, customername);
		
	}
	

}
