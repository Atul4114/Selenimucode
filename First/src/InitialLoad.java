import org.openqa.selenium.chrome.ChromeDriver;

public class InitialLoad {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	}
	 public void LoadData() throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://lifelock.norton.com/");
			Thread.sleep(15000);
	 }

}
