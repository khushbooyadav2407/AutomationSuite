import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("FH-origin")).sendKeys("Dallas");
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("FH-destination")).sendKeys("NYC");
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.DOWN);		
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("Shop flights on AlaskaAir.com")).click();
		
			
	}

}
