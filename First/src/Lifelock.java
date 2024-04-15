import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lifelock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lifelock.norton.com/");
		Thread.sleep(15000);
		// InitialLoad driver= new InitialLoad ();
		// driver.LoadData();

		driver.findElement(By.className("cpra-compliance-banner__content__btn-primary")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'c-btn--min-width')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//form[@id='quizQ1']//a[contains(@class,'c-quiz__why-do-we-ask')][normalize-space()='Why do we ask?']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='c-quiz__innerModal__close']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.id("q1-selectall")).click();

		driver.findElement(By.cssSelector("label[for='concern_c1']")).click();
		driver.findElement(By.cssSelector("label[for='concern_b1']")).click();
		driver.findElement(By.cssSelector("label[for='concern_x2']")).click();
		// driver.findElement(By.xpath("//input[@value='q1-selectall']")).click();
		driver.findElement(By.xpath("//button[@class='c-quiz__form__nextBtn c-btn']")).click();
		boolean a = driver.findElement(By.xpath("//button[@class='c-quiz__form__nextBtn c-btn c-btn--disabled']"))
				.isEnabled();
		Assert.assertTrue(a);
		driver.findElement(By.xpath("//div[contains(text(),'Yourself + 1')]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		boolean b = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isEnabled();
		Assert.assertTrue(b);
		driver.findElement(By.cssSelector(".c-quiz__email__btn__yes.c-btn.c-btn--secondary")).click();
		driver.findElement(By.name("email")).sendKeys("atul@gmail.com");
		driver.findElement(By.cssSelector(".c-quiz__nav__back")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains (text(),'Your family')])")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.cssSelector(".c-quiz__email__btn__no.c-btn.c-btn--secondary")).click();
		driver.findElement(By.cssSelector(".c-quiz__form__nextBtn.c-quiz__email__btn__nextNo.c-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-inid='lifelock_home_quiz-monthly_cart_21423701']")).click();

	}

}
