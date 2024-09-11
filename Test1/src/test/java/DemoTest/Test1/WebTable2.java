package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		//Open Url
		driver.get("https://testautomationpractice.blogspot.com");
		//find total number of rows count in web table
		List <WebElement> rowscounts=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	System.out.println("Total number of rows: " + rowscounts.size());
	//columns counts 
	List <WebElement> columnscounts=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
	System.out.println("Total number of columns: " + columnscounts.size());
	
	for(int r =2; r<=rowscounts.size(); r++ ) {
		
	for (int c =1;c<=columnscounts.size(); c++) {
		String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+ r + "] /td[" + c + "]")).getText();
		System.out.println( data);
			
		}
	}
	
	
	}

}
