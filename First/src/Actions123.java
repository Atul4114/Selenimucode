import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		//Move to specific element hover on tag
		a.moveToElement(driver.findElement(By.cssSelector(".nav-line-1-container"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector(".icp-nav-link-inner"))).build().perform();
		//driver.findElement(By.cssSelector(".nav-line-1-container"));
		driver.findElement(By.xpath("(//span[contains(@dir,'ltr')][contains(text(),'हिन्दी')])[1]")).click();
		
		//Enter the Capital letter in search AND 
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Right click
		a.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']"))).contextClick().build().perform();
	}

}
