package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Swithc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> s= windows.iterator();
		String parentpage = s.next();
		String childpage =s.next();
		driver.switchTo().window(childpage);
		String r= driver.findElement(By.className("example")).getText();
		System.out.println(r);
		driver.switchTo().window(parentpage);
		String l = driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText();
		System.out.println(l);
	}

}
