import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengerDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
	//*	int i=1;
	//	while (i<5)
	//	{
	//	driver.findElement(By.id("hrefIncAdt")).click();
	//	i++;
	//	}
		for (int i=1 ; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
