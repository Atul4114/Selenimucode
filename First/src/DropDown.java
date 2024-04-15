import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//to find location of dropdown create webeelement and pass argument 
		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(staticdrop); //
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
	//	driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
	//	driver.manage().window().maximize();
		drop.selectByVisibleText("AED");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("INR");
		System.out.println(drop.getFirstSelectedOption().getText());
	}

}
