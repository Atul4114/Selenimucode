import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignemnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Atul");
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("yadav@gmail.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
			driver.findElement(By.cssSelector("#exampleCheck1")).click();
			WebElement staticdrop= driver.findElement(By.id("exampleFormControlSelect1"));
			Select drop = new Select(staticdrop); //
			drop.selectByIndex(1);
			System.out.println(drop.getFirstSelectedOption().getText());
			driver.findElement(By.id("inlineRadio1")).click();
			driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("24-08-1985");
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText());
			
			
	}

}
