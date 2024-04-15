import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse (driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		//Asserfalse expected is to be false
	/*	driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		int i=1;
		for (i=1; i<5; i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	
		}
		int j=1;
		for (j=1; j<3; j++)
		{
			driver.findElement(By.xpath("/span[@id='hrefIncChd']")).click();
		}
		
		System.out.println(driver.findElement(By.cssSelector("div.paxinfo")).getText());
		driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		driver.findElement(By.cssSelector("option[value='AED']")).click();
	
		*/
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		//	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		// to count he number of checkbox
	}

}
