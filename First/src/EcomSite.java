import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;


public class EcomSite {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] veg = {"Cucumber","Brocolli","Carrot"}; 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		additems(driver,veg); // static because call the method without creating the object 
	//	EcomSite b = new EcomSite(); // createing object for class and call the method
		//b.additems(driver, veg);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		//explicit wait add here 
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
	}
	
	public static void additems(WebDriver driver, String[] veg)
	{
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0 ; i < products.size() ; i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			//name [0] = brocolli 
			//name [1] = 1kg due to split
			//format it to get actual procudtc name not 1kg 
			List<String> al = Arrays.asList(veg); // array to arraylist conversion
			
			int j=0;
			if (al.contains(formattedname))
			{
				j++;
				//click to add cart
				driver.findElements(By.xpath("(//div[@class='product-action'])")).get(i).click();
				//break; if single array for multiple array break not needed
				if (j>3)
					break;
			}
			
		}
	}

}
