package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NortonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://us.norton.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains (text(), 'Accept All')])")).click();
		driver.findElement(By.xpath("(//button[contains (text(), 'Consumer')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[data-inid*='nortoncom_nav_norton-360-standard_homepage:homepage']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	}

}
