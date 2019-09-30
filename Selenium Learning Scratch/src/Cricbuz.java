import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Cricbuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20239/nz-vs-sl-match-3-icc-cricket-world-cup-2019");
		WebElement Section=driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		//From parent go to 3rd child using CSS we needed 3rd child 
	
		int Count=Section.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<Count-2;i++)
		{
			String Value=Section.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//You cannot add string u need to convert into integer
			//when i=0; Value will be 4 and changed into interger and valueinteger will be 4 which is added to sum which was defined 0
			//when i=1; valueinteger wll be 52 and sum will now will be 4+52=sum
			int valueinterger=Integer.parseInt(Value);
			sum=sum+valueinterger;   
		}
		//System.out.println(sum);
		
		String Extras=Section.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		int integerextras=Integer.parseInt(Extras);
		
		int ExpectedTotal=integerextras+sum;
		
		System.out.println("Expected out is " + ExpectedTotal);
		
		String Actual=Section.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotal=Integer.parseInt(Actual);
		System.out.println("Actual out is " + ActualTotal);
		
		Assert.assertEquals(ActualTotal, ExpectedTotal);
		//OR put a if condition
		
		//LEcture 103 very important
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
