import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIelementsValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//This above step giving wrong output because Selenium thinks object is enabled as we are able to click it.
		
		//Below is the way we can use to validate if element is enabled or not
		
//When you want to validate whether element is enabled or not, always look for attribute which is changing 
//i.e. attribute whose value changes when you enable or disable element. In this case display: block; opacity: 1; 
		//when round trip is selected and changes to display: block; opacity: 0.5; when one way is selected
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
	String Value=driver.findElement(By.id("Div1")).getAttribute("style");
	if(Value.contains("1")) {               //1 is the value of attribute style which changes to 0.5 when element is disabled and 1 when it is enabled 
		System.out.println("Return Date is Enabled");
		//U can put assert.assertTrue(True) as well which will return true if value is 1 else script will fail 
	}
	else {
		System.out.println("Return Date is not Enabled");
	}
	
	
	
	
	
	
	}

}
