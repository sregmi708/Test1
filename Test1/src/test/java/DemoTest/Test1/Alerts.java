package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(5000);
		//Switch to alert window and accept the alert
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href ='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(5000);
		//Switch to alert window and accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@ href ='#Textbox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick ='promptbox()']")).click();
		//Switch to alert window and accept the alert
		driver.switchTo().alert().sendKeys("Test");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
	

	}

}
