package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//Locate username by tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//locate password by tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		//locate login button using tag.value of a class name
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		
		
		

	}

}
