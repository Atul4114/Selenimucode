import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childparentwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //windows ID will present in object
		java.util.Iterator<String> t =windows.iterator();
		String parentID= t.next(); // give parentid
		String childid =t.next(); // gives child id
		driver.switchTo().window(childid);
		String mail = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   // System.out.println(driver.findElement(By.xpath("//a[normalize-space()='mentor@rahulshettyacademy.com']")).getText());
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(mail);
	}

}
