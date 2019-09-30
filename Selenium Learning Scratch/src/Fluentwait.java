import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
	Wait<WebDriver> W	=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	;
	
	//fluentwait is class implementing wait interface just like chromedriver is class implementing webdriver interface
	
	//you need to tell fluentwait that driver is webdriver else it wont understand

	
	W.until(new Function<WebDriver, WebElement>() 
	{
		
		public WebElement apply(WebDriver driver) {
			
			if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed())
			{
				
				 return driver.findElement(By.xpath("//div[@id='finish']/h4"));
			}
			else {
				return null;
		         }   			
                                             	}
	
	} 
	
			);
	
System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText()); 
	
	}

}
