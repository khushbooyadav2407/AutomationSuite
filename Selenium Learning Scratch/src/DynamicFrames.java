import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicFrames {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spotify.com/ca-en/signup/");
		
		//Here its not able to click Robot Icon because its in frame which is dynamic
		
		int number =FindFrameNumber(driver,By.cssSelector(".recaptcha-checkbox-checkmark"));
			driver.switchTo().frame(number)	;
			driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
		
		//Lecture 95 is still pending to do because code didnt work
		
	}

	public static int FindFrameNumber(WebDriver driver, By by) {
		int i;
		//Since frames are rendering dynamically lets take their count and check in which frame that ID is present and get it click on that frame
		//frame starts with iframe 
		int Framecount=driver.findElements(By.tagName("iframe")).size();
		System.out.println(Framecount);
		for( i=0;i<Framecount;i++) 
		{
		driver.switchTo().frame(i);
			//we need to check whether our required xpath is present or not, so take count of that 
			int Count=driver.findElements(by).size();
			if(Count>0) {
				driver.findElement(by); //Whenever element is found return to main function and there we will click
				 break;
				 
			}
			else {
				System.out.println("ID not found");
			}
		}
		
		
		
		driver.switchTo().defaultContent();   //Inorder to come back to main page because another frame is new frame which can be identified from main page
		return i;
	}
	
	
	
}


