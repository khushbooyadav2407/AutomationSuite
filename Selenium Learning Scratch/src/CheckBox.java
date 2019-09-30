import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//When you want to select checkbox, directly use click()
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		//If you want to check whether checkbox is selected or not 
Boolean Result= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected(); //isselected will return true if checkbox is selected else false
		
System.out.println(Result);

//When you want to get total number of checkbox present on webpage-get locator common to all checkbox (here in this case type='checkbox'

int Count= driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	System.out.println(Count);
	
	}

}