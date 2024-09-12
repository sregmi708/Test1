package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		// find webelement signup for facebook
		String actualtooltip = driver.findElement(By.xpath("//a[@href='/reg/'] ")).getAttribute("title");
		
		String expectedtooltip ="Sign Up for Facebook";
		
		
		if(actualtooltip.equals(expectedtooltip)) {
			
			System.out.println("test passed");
			}
				
			 
			 else 
			 {
				 System.out.println("test failed");
			 }
			
			
		
		
		//Sign Up for Facebook
		

	}

}
