import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()); //ISselected should return TRUE in this case
		 
		Thread.sleep(2000); //Added to see results
 		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()); //ISselected should return FALSE in this case
		
		int Count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(Count);
		
		
	}

}
