package DemoTest.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinks {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		//Browser maximize
		driver.manage().window().maximize();
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Open the url
		driver.get("https://www.udyamregistration.gov.in/Udyam_Login.aspx");
		driver.findElement(By.xpath("//img[@src='/assets/img/MINISTRY_NAME.png']")).click();
		System.out.println(" The title of the page is: " + driver.getTitle());
		
		if(driver.getTitle().equals("Udyam Registration : Zero cost, No Fee and Free Registration of MSMEs. This is official website of Govt. of India, Ministry of MSME. No other website/portal/app is official. MSMEs are requested to do MSME Registration here only")) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();

	}

}
