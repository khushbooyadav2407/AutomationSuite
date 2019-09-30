import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		/*driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("Selenium"); */
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath("///div[@class='interview-question']/div/div/ul/li[2]")).click(); //parent-child traverse
		
		//Sibling traverse
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		
		//Traverse back to Parent
		
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));  // going from child 3 to parent
		
		
		//Using text() identify object on webpage
		
		//driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		
		//driver.close();
		
	}

}
