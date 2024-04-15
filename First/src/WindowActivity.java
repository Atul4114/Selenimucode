import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//fully loaded
		driver.navigate().to("https://reflect.run/articles/everything-you-need-to-know-about-nosuchelementexception-in-selenium/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		}
	

}
