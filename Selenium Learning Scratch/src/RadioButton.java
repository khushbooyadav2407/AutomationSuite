import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click(); //using value attribute because there is common value for input and group attribute for first group of radio button
		
		int Count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(Count);
	//When you want to select group of radio button
	/*	for(int i=0; i<Count;i++) {
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click(); //get(i) will get you index from group1 and will click on that
}*/
//When you want to select radio button which has value Milk dynamically without giving straight away value 
		
		for(int i=0;i<Count;i++) {
	String AttributeValue=	driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");//value is the attribute used in webpage
	System.out.println(AttributeValue);
	
	if(AttributeValue.equals("Milk"))
	{
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	}
	}
	}
}
