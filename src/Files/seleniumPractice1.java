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

public class seleniumPractice1 {
	
	//open links in new tab 
	@Test
	public void openLinksinNewTab()

	{
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\Chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();

      
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String linkName=driver.findElement(By.linkText("Latest News")).getText();
		System.out.println(linkName);
		
		WebElement parentLink=driver.findElement(By.xpath("//td[2]/ul"));
		List<WebElement> childLinks=parentLink.findElements(By.tagName("a"));
		 int count=childLinks.size();
		 
		System.out.println(count);
		
		for(int i=1;i<count;i++)
		{
			String clickOnNewTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			childLinks.get(i).sendKeys(clickOnNewTab);
			//driver.navigate().back();
			
		}
		
		////practice:
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		
		
		}
		driver.switchTo().window(parent);
		driver.switchTo().defaultContent();
}
}}
