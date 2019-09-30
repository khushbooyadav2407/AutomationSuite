import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
	driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	WebElement Source=driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open"));		
	Source.sendKeys("MUM");
	Source.sendKeys(Keys.ARROW_DOWN);
	Source.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//label[@for='toCity']")).click();
	WebElement destination=driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open"));
	//You might think above CSSselector is same as source but on website it opens destination window(which is different than source) and inside that
	//we have selected cssselector 
	destination.sendKeys("DALLAS");
	destination.sendKeys(Keys.ARROW_DOWN);
	destination.sendKeys(Keys.ENTER);
	}

}
