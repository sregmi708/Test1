package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		//Launch chrome driver
		WebDriver driver =new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		//Open Url
		driver.get("C:\\Users\\sregm\\git\\repository\\Test1\\sampleTable.html");
		//find second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		//find total number of rows count in web table
	List <WebElement> rowList =driver.findElements(By.xpath("//table/tbody/tr"));
		
	System.out.println("rows: " + rowList.size());
	//find total number of columns in webtable
	List <WebElement> columnList =driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
	System.out.println("columns: " + columnList.size());
	
	//forloop for row
	for(int r =2; r<=rowList.size();r++ ) 
	{//for loop for column
		for(int c=1; c<=columnList.size();c++) 
		{
			String data = driver.findElement(By.xpath("//table/tbody/tr["+ r + "] /td[" + c + "]")).getText();
			System.out.println( data);
			
		}
		
	}
	
	
	
	}

}
