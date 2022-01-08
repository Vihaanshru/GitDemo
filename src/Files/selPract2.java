package Files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.Iterator;

public class selPract2 {
	
	//open links in new tab 
	
	@Test
	public void openLinksinNewTab() {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\Chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();

		String parent_window=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			
			
			String childwindow=it.next();
			
			if(!parent_window.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				
			}
		}
		
		
}
}