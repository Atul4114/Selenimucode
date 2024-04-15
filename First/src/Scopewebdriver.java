import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopewebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//1. count the links on the page -> to find the //a anchor tag
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//2. Count the links in footer only
		//- current driver access all the compoment on the page
		// - so we have to create the subset of driver
		//- first identify the component
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // now footerdriver is subsection of driver
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
//3. Count the number of Links in footer first coloumn
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println( columndriver.findElements(By.tagName("a")).size());
	
//4. click on each link in column and check its working or not
		for (int i =1;i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER); // to click the hyperlink
			
		//	columndriver.findElements(By.tagName("a")).get(i).click();
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		//open the all tabs	
					
		}
		// this code will print the tittle with windowshandles
			Set<String> abc = driver.getWindowHandles();
			java.util.Iterator<String> it = abc.iterator();
			while(it.hasNext()) //hasnext indicates next index present or not
			{
				driver.switchTo().window(it.next()); //next move to next index
				System.out.println(driver.getTitle());
				}
		}
	

}
