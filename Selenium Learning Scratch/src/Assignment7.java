import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
		
		/*JavascriptExecutor js= (JavascriptExecutor)driver;
		
		
		String Script=     "return document.getElementById('autocomplete').value;";
		String text=         (String) js.executeScript(Script);
		
		int i=0;
		          
		 System.out.println(text);
		while(!text.equalsIgnoreCase("India"))
		{   
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text=         (String) js.executeScript( "return document.getElementById('autocomplete').value;");
			
			if(i>5)
			{
				break;
			}
			
		}*/
		
	}

}
