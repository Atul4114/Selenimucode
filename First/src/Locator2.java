import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name ="atul";
		ChromeDriver test2 = new ChromeDriver();
		test2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		test2.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(test2.getCurrentUrl());
		
		String password = getpassword(test2);
		test2.findElement(By.id("inputUsername")).sendKeys(name);
		test2.findElement(By.name("inputPassword")).sendKeys(password);
		test2.findElement(By.id("chkboxOne")).click();
		test2.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(5000);
		System.out.println(test2.findElement(By.tagName("p")).getText());
		Assert.assertEquals(test2.findElement(By.tagName("p")).getText(),"You are successfully logged in." );
		System.out.println(test2.findElement(By.xpath("//h2")).getText());
	//	Assert.assertEquals(test2.findElement(By.xpath("//h2")).getText(),"Hello "+name+","" ));
		test2.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();		
		test2.close();
	}
	public static String getpassword(ChromeDriver test2) throws InterruptedException
	{
		test2.get("https://rahulshettyacademy.com/locatorspractice/");
		test2.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(4000);
		test2.findElement(By.className("reset-pwd-btn")).click();
		String passtext = test2.findElement((By.cssSelector(".infoMsg"))).getText();
		//"Please use temporary password 'rahulshettyacademy' to Login."
		String[] passarray = passtext.split("'");
		//oth index please use temporary passowrd
	    //1st index rhualshettyacademy to login
		
	
		passarray[1].split("'");
		
		//0th index - rahulshettyacademy
		//1st - index to login
		//String[] passarray2 = passarray[1].split("'");
		//passarray2[0];
		String password= passarray[1].split("'")[0];
		return password;	
		
		
		
		
	}
}
