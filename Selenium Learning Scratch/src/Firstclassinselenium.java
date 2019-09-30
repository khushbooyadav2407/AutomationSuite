import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclassinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver is the class and webdriver is the interface which has all methods 
		
		WebDriver driver=new ChromeDriver();  //Created driver object for chromedriver class return type is webdriver as its interface

		/*driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//validate title of current URL is correct or not
		System.out.println(driver.getCurrentUrl()); //to validate current URL
		//System.out.println(driver.getPageSource());// inorder to get page source inorder to identify frame
		driver.get("https://yahoo.com");
	driver.navigate().back();
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.close();
	driver.quit(); //closes all the web page */

	}

}
