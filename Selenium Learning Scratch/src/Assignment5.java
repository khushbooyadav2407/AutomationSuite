import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='nested_frames']")).click();
        driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
