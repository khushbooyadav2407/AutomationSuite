import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenarios {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		//How to get count of links on webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Get me count of links in footer section

		//LIMITING WEBDRIVER SCOPE
		
		WebElement Footerdriver=driver.findElement(By.id("gf-BIG")); //Here you are giving control of footer section into WebElement Footerdriver 
		//Footerdriver has access to ONLY footer section on webpage unlike driver which has access to entire page
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		
//3-> Count of links in first column of footer
		
		WebElement Columndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
	//Concept is travel from main driver to footerdriver then travel to columndriver and finding number of links in that section
		
		//4:- Click on each link and check whether links are opening or not 
		//In this case we willnot write xpath for all link and click because in future it might change
		
		int  Count =Columndriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<Count;i++)  //Starts from 1st link
		{
			//String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			
			
		} //Opens all tabs
	//5. Get the title of each tab  using child window handler
			
			Thread.sleep(5000);
			Set<String> abc =driver.getWindowHandles();
			 Iterator<String>    It=   abc.iterator();
			//Use whileloop and condition will be if IT.hasnext() then only do it.next() else nope
		while(It.hasNext())   //if this is true then control will go inside and increase to next child
			
		{
			driver.switchTo().window(It.next());
			
			System.out.println(driver.getTitle());
			
		}
		
	
		
		
		
		
		
		
		
		
	}

}
