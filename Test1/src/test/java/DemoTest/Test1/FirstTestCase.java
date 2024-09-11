package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Launch google page
		driver.navigate().to("http://www.google.com");
		//Capture title of webpage and print
		String title = driver.getTitle();
		System.out.println("Page title:  " + title);
		
		//Capture url of the webpage and print
		System.out.println("URL: " + driver.getCurrentUrl());
		
		//close the browser
		driver.close();
		

	}

}
