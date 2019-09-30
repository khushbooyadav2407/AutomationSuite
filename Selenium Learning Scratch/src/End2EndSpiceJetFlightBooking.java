import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndSpiceJetFlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Pune (PNQ)']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("Return Date Element is Enabled");
		}
		else {
			System.out.println("Return Date Element is NOT Enabled");
			
		}
		Thread.sleep(2000);  
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);  
		
		for(int i=1;i<4;i++) {
		
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		String Message=driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(Message);
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), Message);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Select S=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		S.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		
		
		
		
		
		
	}

}
