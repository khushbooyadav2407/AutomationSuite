import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();

			driver.get("https://www.spotify.com/ca-en/signup/");



			int frame = framecount(driver,By.className("recaptcha-checkbox-checkmark"));

			driver.switchTo().frame(frame);

			driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();

			}



			public static int framecount(WebDriver driver,By by)

			{

			int i;

			int framecount =driver.findElements(By.tagName("iframe")).size();



			System.out.println(framecount);



			for (i=0;i<framecount;i++)

			{



			driver.switchTo().frame(i);



			int itemcount = driver.findElements(by).size();

			if(itemcount>0)

			{

			break;

			} else

			{

			System.out.println("Continue");

			}

			driver.switchTo().defaultContent();

			}

			driver.switchTo().defaultContent();

			return i;

			}

			


	}


