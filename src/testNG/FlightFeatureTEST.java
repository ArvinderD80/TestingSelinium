package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightFeatureTEST {
	WebDriver driver;
	@BeforeMethod
	 public void Initialization() {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\msedgedriver.exe"); 
		   driver =new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		   driver.get("https://demo.guru99.com/test/newtours/index.php");
		   driver.manage().deleteAllCookies();
		  
}
	
//	@AfterMethod 
//		public void BacktoHomePage() {
//		 driver.findElement(By.linkText("Home")).click();	
//}
	
   @AfterTest
   public void Teardown() {
          driver.close();
}
	@Test 
	public void FlightFeatureTest1() {
		driver.findElement(By.linkText("Flights")).click();
//		driver,sw
//	//	 WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
//		 WebElement element1 = driver.findElement(By.cssSelector(" #dismiss-button"));
//		    element1.click();
//	      WebElement passenger=driver.findElement(By.xpath("//Select[@name='passCount']"));
//		  Select select=new Select(passenger);
//		select.selectByValue("3");
//		passenger.click();
		
	   }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

