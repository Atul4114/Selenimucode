import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		int i;
		for (i=1; i<2;i++)
		{
			driver.findElement(By.cssSelector("#checkBoxOption1")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		}
		
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
	}

}
