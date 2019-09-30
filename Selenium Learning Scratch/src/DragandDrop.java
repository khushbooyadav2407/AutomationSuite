import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		//on this site you drag and drop 
		//driver.findElement(By.xpath("//div[@id='draggable']")).click(); //This willnot click because its part of frames 
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.xpath("//div[@id='draggable']")).click(); //USe now this will click
		
		Actions a=new Actions(driver);
		a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		//If you want to send control to normal window or come out of frane
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
