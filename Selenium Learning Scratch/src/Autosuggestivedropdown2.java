import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getAttribute("value"));
		
		
		//Java Script Executor
	/*	JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		
		String value = "return document.getElementById(\"fromPlaceName\").value;"; 
				//Dont not forget to put semi colon at the end of value;
		//Putting return will return value
		//Script is ready and now lets execute
		String text= (String) js.executeScript(value);  //(String) is casting Eclipse will tell u to put 
		System.out.println(text);
		int i=0;
while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
{
	
	i++;
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	
	text= (String) js.executeScript(value);  //(String) is casting Eclipse will tell u to put 

  if(i>10)
  {
	  break;
  }


}
		
	if(i>10) {
		System.out.println("Element not found");
	}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
