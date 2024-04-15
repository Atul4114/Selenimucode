import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		//implicit wait require to get 5s delay message display
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\atuly\\Downloads\\geckodriver-v0.34.0-win64");
		WebDriver test2 = new FirefoxDriver();
		//ChromeDriver test2 = new ChromeDriver();
		
		test2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		test2.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(test2.getCurrentUrl());
		test2.findElement(By.id("inputUsername")).sendKeys("atul");
		test2.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
		test2.findElement(By.className("submit")).click();	
		
		System.out.println(test2.findElement(By.cssSelector("p.error")).getText());
		test2.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(4000);
		test2.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("atul");
		test2.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Yadav");
		test2.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("123456");
		test2.findElement(By.cssSelector("input[placeholder='Phone Number']")).clear();
		test2.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7777");
		test2.findElement(By.className("reset-pwd-btn")).click();
		
		System.out.println (test2.findElement((By.cssSelector(".infoMsg"))).getText());
		test2.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		test2.findElement(By.id("inputUsername")).sendKeys("atul");
		test2.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		test2.findElement(By.id("chkboxOne")).click();
		test2.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		//test2.findElement(By.cssSelector("button.gh"ost")).click();		
		

	}

}
