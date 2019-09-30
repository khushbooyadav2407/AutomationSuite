import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforceloginalllocatorused {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("khushbooyadav2");
	driver.findElement(By.name("pw")).sendKeys("12345");
	//driver.findElement(By.className("button r4 wide primary")); //You will get an error -->>compound class not permitted 
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	String Message=driver.findElement(By.cssSelector("#error")).getText();
	System.out.println(Message);
	
	
	}

}
