import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.linkText("Privacy")).click();
		System.out.println(driver.getTitle());
		
		//Here even though window was changed output printed title of parent window, meaning we need to switch to child window inorder to send control
		//USe getWindowHandles() method to get window IDS
		Set<String> IDs=driver.getWindowHandles(); 
		//all window ids are stored in ids if using iterator method if you want to traverse to your required step in your data set 
		Iterator<String> ITs=IDs.iterator();
		//Now using ITs you can travel to next child using .next() method
		String ParentID=ITs.next(); //first one will default parent 
		String Child1= ITs.next(); //goes to first child
		
		//now you got your child id pass it into below code
		driver.switchTo().window(Child1);
		//now print title of your child window same as step 17
		System.out.println(driver.getTitle());
		//If you want to switch back to parent then use below code 
		//driver.switchTo().window(ParentID);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
