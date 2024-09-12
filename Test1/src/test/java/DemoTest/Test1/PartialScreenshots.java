package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshots {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(" https://facebook.com");
		//Store in webelement  object
		WebElement partail = driver.findElement(By.xpath("//button[@name='login']"));
		//Step2  call get ScreenshotsAs method to create  image file
		//Use Webelement object to call getScreenshotA method  for creating image file 
		
		File src = partail.getScreenshotAs(OutputType.FILE);
		//Create file object file for destination -mention the complete file path to store the image
		File dest = new  File ("C:\\Users\\sregm\\git\\repository\\Test1\\Screenshots\\Login.png");
		//Step3 Copy image file to destination
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot saved to " + dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
