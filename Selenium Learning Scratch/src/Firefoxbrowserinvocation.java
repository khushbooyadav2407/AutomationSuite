import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\yadav\\Documents\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

	//WebDriver driver=new FirefoxDriver();
	//driver.get("https://google.com");
//	driver.get("https://www.google.com");
	//System.out.println(driver.getTitle());
	
	Method M1= new Method();
	String S=M1.ValidateHeader(); //since your method is return some string take that here into a string
	//classobject.methodname;
	System.out.println(S);
	}

	
	
	
}
