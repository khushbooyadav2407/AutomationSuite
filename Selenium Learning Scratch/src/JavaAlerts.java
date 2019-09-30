import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		//Now control is in WebPage we need to switch driverto alert clas
		Thread.sleep(2000);
		
		//When you want to verify the text of alert
		System.out.println(driver.switchTo().alert().getText());
		
		
		driver.switchTo().alert().accept();      //here accept shows that you agree to alert, Ok, YEs accept positive scenarios
		
	//When you want to select No or reject alert then use below
		//driver.switchTo().alert().dismiss();
		
		//Suppose when you have option to enter something in alert screen , we dont have here in this website
		//driver.switchTo().alert().sendKeys("PASSED");
	
	}
	
}
