package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTesting {

	WebDriver driver;

	@Test
	public void Checkbox() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to https://live.demoguru99.com/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 2. To Verify if the  Checkbox is checked.
		WebElement Checkbox = driver.findElement(By.id("checkBoxOption1"));
		Checkbox.click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

		// 3. To Verify if the Checkbox is Unchecked.
		WebElement UnCheckbox = driver.findElement(By.id("checkBoxOption1"));
		UnCheckbox.click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		// 4. Finding the number of Checkbo in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//Total link counts
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Count of footer link
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// Count of column
		WebElement columndriver = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]")); 
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());   
		
		//Count of second column
		WebElement columndriver2 = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
		System.out.println(columndriver2.findElements(By.tagName("a")).size());  
			
		driver.quit();

	}
}