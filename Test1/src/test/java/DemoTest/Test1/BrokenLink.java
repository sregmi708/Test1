package DemoTest.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.awt.image.ImageWatched.Link;

public class BrokenLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Browser maximize
		driver.manage().window().maximize();
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Open the url
		driver.get("http://www.deadlinkcity.com");
		//find hiperlink and capture
		List<WebElement>linklist =driver.findElements(By.tagName("a"));
		int rescode =200;//2xx valid link
		int brokenLinkCount = 0;
		//Print the total hyperlink 
		System.out.println("Total link on page " + linklist.size());
		//Using forloop to capture  the url for the hyperlink
		for( WebElement element:linklist)
		{
			String url = element.getAttribute("href");
			
			try {
				
				URL urlLink =new URL(url);
				//Used http connection to open the url 
				HttpURLConnection huc =(HttpURLConnection)urlLink.openConnection();
				//send the request to the link
				huc.setRequestMethod("HEAD");
				//connect
				huc.connect();
				//Checking the response code 
				rescode =huc.getResponseCode();
				//If the response code is > 400 its broken
				if(rescode >=400) {
					System.out.println(url + "broken Link.");
					brokenLinkCount ++;
				}
				
			}
			
			catch(MalformedURLException e) 
			{
				
			}
			catch (Exception e) 
			{
		}
	}
		System.out.println("Total broken links"+ brokenLinkCount);
		driver.close();
		

	}
	
}
