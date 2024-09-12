package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(" https://facebook.com");
		//capture full page screenshot
		//step 1 convert webdriver object to Take Screenshot interface
		TakesScreenshot screenshot =((TakesScreenshot) driver);
		
		//Step2:call getScreenshotAs method to create image file 
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		 
		
File dest = new  File ("C:\\Users\\sregm\\git\\repository\\Test1\\Screenshots\\screenshot.png");
	

    
		
		//Step 3 copy image file to Destination 
		try {
			FileUtils.copyFile(src,  dest);
			System.out.println("Screenshot saved to " + dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//close the browser
		driver.close();
		
		
		

	}

}

