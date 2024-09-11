package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//Single attribute
		//driver.findElement(By.xpath("//input[@ id='user-name']")).sendKeys("standard_user");
		//Contains
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		//Start with method
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");
		//Start with method
		//Multiple attribute
		driver.findElement(By.xpath("//*[@id='password'] [@name='password']")).sendKeys("secret_sauce");
		//Locate login button
		driver.findElement(By.xpath("//input[@id ='login-button']")).click();
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("// button[@ id='add-to-cart-sauce-labs-bike-light'or @name ='add-to-cart-sauce-labs-bike-light']")).click();
		//last method
		//input[@type='text'][last()]
	}

}
