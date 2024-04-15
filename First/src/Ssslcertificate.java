import java.lang.reflect.Proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ssslcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		//Proxy proxy = new Proxy();
	
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);//provide the argument as opt to behave chrome browser
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle()); // to get tittle of page
		

	}

}
