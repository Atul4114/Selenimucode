package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeImplicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10));
		t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='consult']")));
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		WebDriverWait m = new WebDriverWait(driver, Duration.ofSeconds(10));
		m.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//button[@class='btn btn-info'])[1]"))));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[4]")).click();
		WebDriverWait l = new WebDriverWait(driver, Duration.ofSeconds(15));
		l.until(ExpectedConditions.visibilityOfElementLocated(((By.cssSelector(".nav-link.btn.btn-primary")))));
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		//driver.findElement(By.className("btn btn-info"));
	}
//*public static void additems1(WebDriver driver)

//	WebElement products1 = driver.findElement(By.className("btn btn-info"));
	
//	for (int k=0; k < products1.getSize(); k++)
//	{
		
//	}
	
//}

}