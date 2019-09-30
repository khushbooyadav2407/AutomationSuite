import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceusingCSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input.input.r4.wide.mb16.mt8.username")).sendKeys("khushbooyadav2356243");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("53745");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
