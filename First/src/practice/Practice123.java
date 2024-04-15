package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice123 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("atul");
		driver.findElement(By.name("inputPassword")).sendKeys("yadav");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("atul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("atul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		
	}

}
