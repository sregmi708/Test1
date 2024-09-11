package DemoTest.Test1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC_xpath_Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//switch to Product page
		String currentWindowHandle =driver.getWindowHandle();
		
		driver.switchTo().window(currentWindowHandle);
		
		//locate Sauce labs Bolt T shirt 
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		//driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();
		//List <WebElement> elementList =  driver.findElements(By.partialLinkText("Sauce"));
		//System.out.println("Element size: " + elementList.size());
		  // Locate Sauce Labs Bolt T-Shirt
		List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
        System.out.println("Element size:" + elementList.size());

   
        
        //driver.quit();
		

	}

}
