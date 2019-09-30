import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		WebDriverWait d=new WebDriverWait(driver, 10);
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
	
		String text=driver.findElement(By.xpath("//div[@id='results']")).getText();
	
	System.out.println(text);
	
	}

}
