package DemoTest.Test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/upload-download");
			//If type=file we can use send keys
			//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\My resume\\Sagar Regmi.docx");
			WebElement element =driver.findElement(By.xpath("//input[@id='uploadFile']"));
			//Perform click action
			Actions act = new Actions(driver);
			act.moveToElement(element).click().perform();
			//Using robot class
			Robot rb= new Robot();
			rb.delay(2000);
			//copy file to clipboard
			StringSelection ss = new StringSelection ("C:\\My resume\\Sagar Regmi.docx");//file path copy to clipboard
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			//now we need to paste
			//perform contorl+V action to paste file
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			//create enter method to upload the file
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			
			

}
}
