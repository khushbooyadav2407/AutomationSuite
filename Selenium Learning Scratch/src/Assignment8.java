import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
	//WebElement table=	driver.findElement(By.id("product"));
	//To get column count =table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
	  //     List<WebElement> Column2=     table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	//To print first column of row 2=Column2.get(0).getText();
	       
	System.out.println("Number of rows "+ driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
	System.out.println("Number of Columns " + driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
	
	String One=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[1]")).getText();
	String Two=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[2]")).getText();
	String Three=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]")).getText();
	
	System.out.println(One);
	System.out.println(Two);
	
	System.out.println(Three);
	}

}
