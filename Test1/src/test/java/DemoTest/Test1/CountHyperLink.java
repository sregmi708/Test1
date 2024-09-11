package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		//FInding the total link on the Webpage
		List<WebElement> linkElements =driver.findElements(By.tagName("a"));
		System.out.println("Total links on webpage : " + linkElements.size());
		
		for(WebElement el:linkElements) {
			System.out.println(el.getText());
		}
		driver.close();
//opencart.com
	}

}
