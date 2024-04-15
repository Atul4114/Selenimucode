import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolldownpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver; // scrooll trhoguth javascript
		js.executeScript("window.scroll(0,500)"); // from console you can find the location
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List <WebElement> ll= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for (int i= 0 ;i< ll.size(); i++)
		{
		sum = sum + Integer.parseInt(ll.get(i).getText()); // integer.parseInt to convert string into integer
		System.out.println(sum);
		
		
		}
		
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());	
		System.out.println("total is "+total);
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(sum, total);
		
		
	}

}
