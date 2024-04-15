import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'][normalize-space()='Goa (GOI)'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/a[@class='ui-state-default'][normalize-space()='1']")).click();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		for (i=1; i<5; i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	
		}
		int j=1;
		for (j=1; j<3; j++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		
		System.out.println(driver.findElement(By.cssSelector("div.paxinfo")).getText());
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		driver.findElement(By.cssSelector("option[value='AED']")).click();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		//driver.findElement(By.xpath("//a[text()='Special Assistance'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
		
	}

	

}
