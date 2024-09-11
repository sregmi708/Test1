package DemoTest.Test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Browser maximize
		driver.manage().window().maximize();
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Open the url
		driver.get("https://www.udyamregistration.gov.in/Udyam_Login.aspx");
		//Find radio button web elements on webpage
		List<WebElement>radiobuttonLists = driver.findElements(By.xpath("//input[@type='radio']"));
		//Print total number of radio button in radiobutton list
		System.out.println("Total number of radio button on the web page: "+ radiobuttonLists.size()) ;
		//Close current  browser
		driver.close();
		
		
		

	}

}
