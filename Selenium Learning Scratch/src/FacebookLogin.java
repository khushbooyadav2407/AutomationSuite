import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");		
		//driver.findElement(By.linkText("Forgot account?")).click(); //uses text of link (link starts with <a)

//examples of writing xpath and same way CSS
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("khushbooyadav2");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
