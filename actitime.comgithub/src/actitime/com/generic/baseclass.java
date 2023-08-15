package actitime.com.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import actitime.com.pom.entertimetrackpage;
import actitime.com.pom.loginpage;

public class baseclass {
	public WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		driver=new ChromeDriver();
		Reporter.log("openbrowser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("closebrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		 filelib f = new filelib();
				String url = f.getpropertydata("url");
				String un = f.getpropertydata("username");
				String pwd = f.getpropertydata("password");
				driver.get(url);
				loginpage l=new loginpage(driver);
				l.login(un, pwd);
	
				
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		entertimetrackpage e=new entertimetrackpage(driver);
		e.setlogout();
	}
	
		
		
	}


