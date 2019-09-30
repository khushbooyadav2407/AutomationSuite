import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path2USACalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//First pickout date 
		//Select Month
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//Here take classname as same classname has values so take CSSselector
		
		//Below step says if date picker contains doent contain april then it will return false and !false=true then while loop will execute and will click on next
		//icon in calendar untill it find our desired month
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().equals("April 2020"))
		
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}
		
			
		// Unique parent class='datepicker-days followed by child class='next'
		
		
		
		
		int Count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<Count;i++)
		{
						String Text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(Text.equals("24")) {
			driver.findElements(By.cssSelector(".day")).get(i).click(); //here if i=2 then if condition fails goes to for loop and increases to 3.....till 31
				
//when 31 is send to if condition is passed then that index will be clicked 	
			
			break;    //In order to come out of for loop meaning when value is identified in 1st time no need to execute for loop
			}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
