package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// create chromedriver instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myudyogaadhar.org/");
		driver.findElement(By.id("applicant_name")).sendKeys("sagar");
		driver.findElement(By.id("mobile_no")).sendKeys("8173196352");
		driver.findElement(By.id("email")).sendKeys("sagartest@gmail.com");
		
		
		//WebElement element =driver.findElement(By.id("gender"));
		
		//Select dropdown =new Select(element);
		//dropdown.deselectByVisibleText("Male");
		Select drpgender = new Select(driver.findElement(By.id("gender")));
		drpgender.selectByVisibleText("Male");
		driver.findElement(By.id("name_of_ent")).sendKeys("sagar llc");
		Select drporganization = new Select(driver.findElement(By.id("organisation_type")));
		drporganization.selectByVisibleText("Hindu Undivided Family");
		driver.findElement(By.id("office_address")).sendKeys("101 main st pflugerville tx 78665");
		driver.findElement(By.id("office_district")).sendKeys("Mechi");
		driver.findElement(By.id("office_pin")).sendKeys("123456");
		Select drpEnterprise = new Select(driver.findElement(By.id("main_business_activity")));
		drpEnterprise.selectByVisibleText("Manufacturer");
		driver.findElement(By.id("tems_and_cond_checkbox")).click();
		
		
		Select drpstate = new Select(driver.findElement(By.id("office_state")));
		drpstate.selectByVisibleText("BIHAR");
		driver.findElement(By.id("complete_application")).click();
		
		if (drpstate.isMultiple()) {
			
			System.out.println("Drop down is multiple");
		}
		else {
			System.out.println("Drop down is not multiple");
		}
		
		List <WebElement> alldropdownoptions = drpstate.getOptions();
		System.out.println("Total options: "+alldropdownoptions.size() );
		for(WebElement el :alldropdownoptions) {
			System.out.println(el.getText());
		}
		driver.close();

	}

}
