import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//Select S=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//S.selectByValue("USD");
		String Output=driver.findElement(By.id("divpaxinfo")).getText();
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(Output);
		
		Thread.sleep(2000);
		
		int i=1;        //you can use for loop as well for(int i=1;i<5;i++)
		while(i<5)  {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
		 Output=driver.findElement(By.id("divpaxinfo")).getText();
	
	System.out.println(Output);
	}

}
