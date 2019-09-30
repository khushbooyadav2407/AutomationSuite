import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String CBText =driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(CBText);
		driver.findElement(By.id("dropdown-class-example")).click();
				
		Select S=new Select(driver.findElement(By.id("dropdown-class-example")));
        S.selectByVisibleText(CBText); //selectbyvalue is for the attribute value present on HTML we cannot use here as no hardcoding is allowed
        
        driver.findElement(By.id("name")).sendKeys(CBText);
        
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        
String Message=   driver.switchTo().alert().getText();
		
if(Message.contains(CBText))
{
	System.out.println("Pass");
}
	
else {
	System.out.println("FAIL");
}
		
		
		
		
		
		
		
	}

}
