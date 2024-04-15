package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calenderui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthNumber =6;
		String date ="15";
		String year ="2027";
		String[] expecteddate = {monthNumber,date,year};
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@placeholder='----']")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(monthNumber-1).click()); //index start from 0
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
	//	System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());
		List <WebElement> actulalist = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i =0 ; i <actulalist.size() ; i++)
		{
			System.out.println(actulalist.get(i).getAttribute("value"));
			Assert.assertEquals(actulalist.get(i).getAttribute("value"), expecteddate[i]);
			
		}
		driver.close();
	}

}
