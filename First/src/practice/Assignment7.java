package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				JavascriptExecutor js =(JavascriptExecutor)driver; // scrooll trhoguth javascript
				//driver.findElement(By.cssSelector(".table-display"));
				js.executeScript("window.scroll(100,500)"); // from console you can find the location
				Thread.sleep(5000);
				System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
			    List <WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
			    int rowcount = rows.size();
			    System.out.println(rowcount);
			    List <WebElement> column = driver.findElements(By.xpath("//table[@name='courses']//tr//th"));
			    int colcount = column.size();
			    System.out.println(colcount);
				
				
	}

}
