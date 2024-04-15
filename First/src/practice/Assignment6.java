package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		String a = driver.findElement(By.xpath("//input[@id='checkBoxOption3']/parent::label")).getText();
		Select sel = new Select(driver.findElement(By.id("dropdown-class-example"))); //drop down class
		sel.selectByVisibleText(a);
		
		
		
		}

}
