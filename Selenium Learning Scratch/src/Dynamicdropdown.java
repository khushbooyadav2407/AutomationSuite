import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		/*driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click(); //As selenium reads from top left It will not find Chennai because arrival 
		//window was open and it will search in departure which was closed
		//so here we mentioned index [2] to tell selenium to select second Chennai which belongs to Arrival
		*/
		//TRYING USING PARENT CHILD TRAVERSE
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
	}

}
