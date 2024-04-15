import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableEnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).isEnabled();
	//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).isEnabled();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println("display: block; opacity: 1;");
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enable");
		}
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	}

}
