package JavaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		
		
		
		/*Aamzon website 

Check for jbl headphoens in search bar

click on search button 

navigate to a apge then get title and display the title:
*/
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.com/");
		
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("race track toys for 5 years old");
		ele.sendKeys(Keys.ENTER);
		
		System.out.println("Title is"+" "+driver.getTitle());
			
	}
}
