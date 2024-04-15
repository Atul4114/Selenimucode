import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaMic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//td[@class='mapbg']//a[@value='BLR']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
	//	System.out.println(driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
	}

}
