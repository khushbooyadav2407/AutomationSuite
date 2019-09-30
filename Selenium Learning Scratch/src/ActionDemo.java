import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
     //when you want to mouse over on some link on site 		
		driver.manage().window().maximize();
	//Just like select class we are creating action class with object
		
		Actions a=new Actions(driver);
		//If you want to move mouse on some elememt and add build your action and perform
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		//Now lets do composite actions as below for typing in caps hello
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//now we need to build this step and perform
		
		//Now if you want to select entire text hello by double clicking using mouse using doubleClick() method
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//IF you want to right click on any item use contextclick()
		
		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
