package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source =driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target =driver.findElement(By.xpath("//div[@id='box107']"));
		Actions act =new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
	}

}
