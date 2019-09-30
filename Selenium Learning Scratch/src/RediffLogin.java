import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.rediff.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click(); //Xpath regular expression
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("khushbooyadav25378");
driver.findElement(By.cssSelector("input[name='passwd'")).sendKeys("1235");
driver.findElement(By.cssSelector("input[name*='proce']")).click(); //CSS regular expression 

	}

}
