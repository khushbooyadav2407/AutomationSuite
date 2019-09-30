import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		//driver.findElement(By.xpath("//a[@href='/windows/new']")).click();// can be done using regular expression
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> its=   ids.iterator();
		String Parentid=its.next();
		String Childid=its.next();
		
		driver.switchTo().window(Childid);
		String text=driver.findElement(By.cssSelector(".example h3")).getText();
		System.out.println(text);
		
		driver.switchTo().window(Parentid);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
