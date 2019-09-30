import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Select S = new Select(driver.findElement(By.id("Adults")));
		S.selectByValue("3");
		Select S1 = new Select(driver.findElement(By.id("Childrens")));
		S1.selectByIndex(1);

		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		// OR driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("INDIGO");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

		String Message = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(Message);

	}

}
