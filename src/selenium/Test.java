package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static String baseUrl = "https://www.abhibus.com/";
	public static WebDriver driver;

	// WebDriver driver = WebDriverManager.chromedriver().create();
	//

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder=\"From Station\"]")).click();
		//driver.switchTo().alert().accept();
					
		//driver.findElement(By.xpath(
			//	"//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("vij");
			
		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
		//driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();	
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).click();
		driver.findElements(By.xpath(""));

		//li[@aria-label='TATKAL']
		
	}
}
//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']