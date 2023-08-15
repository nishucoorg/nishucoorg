package actitime.com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColour {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String colour=driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(colour);
		String style=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(style);
		
	}
}
