import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionusingtesNGjar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//Inorder to verify automatically use assertion, example below step throws output as false i.e no checkbox is selected
		//we can verify using assertion whether below code returns false or not
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); //assertFalse(false) expects false
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		 
Boolean Result= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected(); //isselected will return true if checkbox is selected else false
		//After you have clicked checkbox above line of code return true value and lets verify using assertion
//You can print Result if you want to but assertion automatically tells whether its passed or failed no need to check manuallay in console
Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); //assertTrue(expects true value)

//It will pass if code returns true else test case will fail

//Selecting 5 adults in dropdown i.e 4 times because 1 adult is bydefault selected
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); //This will print output of adults before clicking + icon
Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			
       driver.findElement(By.id("hrefIncAdt")).click();
		       
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); //This will print output of selected adults after clicking +icon
		//Instead of above step and checking manually in console Put assertion validation actuall and expected value 
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText() , "5 Adult");
		//Assert.assertEquals(actual, expected) here expected was 5 Adult as we clicked 4 times + icon and actual is what is coming out of testing
		
	}

}
