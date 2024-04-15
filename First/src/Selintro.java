import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Selintro {

	public static void main(String[] args) {
		//Invoking browser
		
		//chrome-browser - class ChromeDriver -> method
		//ChromeDriver test = new ChromeDriver();
		FirefoxDriver test1 = new FirefoxDriver();
		test1.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(test1.getTitle());
		System.out.println(test1.getCurrentUrl());
		//System.out.println(s);
		test1.findElement(id=)
		test1.close();
		
		
		

	}

}
