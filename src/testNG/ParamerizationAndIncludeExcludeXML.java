package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamerizationAndIncludeExcludeXML {
	WebDriver driver;
    @Parameters({"chromeKey","chromePath","testURL"})
	@BeforeMethod
	 public void Initialization(String chromeKey,String chromePath, String testURL) {
		   System.setProperty(chromeKey, chromePath); 
		   driver =new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		   driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS );
		   driver.get(testURL);
		   driver.manage().deleteAllCookies();
		  
}
	
	@AfterMethod 
		public void BacktoHomePage() {
		 driver.findElement(By.linkText("Home")).click();	
}
	
    @AfterTest
    public void Teardown() {
           driver.close();
}
	@Test (dataProviderClass=testNGTests.PositiveLoginFunctionalityTestDATA.class,dataProvider="PositiveLoginFunctTest",priority=0)
	public void PositiveLogInFunctionalityValidCredentialsTest1(String username,String password) { 
	 driver.findElement(By.name("userName")).sendKeys(username);
     driver.findElement(By.name("password")).sendKeys(password);
     driver.findElement(By.name("submit")).click();
     WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
     String actualLoginSuccessMsg = loginSuccessMsg.getText();
     String expectedLoginSuccessMsg = "Login Successfully";
     Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
     
}
	@Test(dataProviderClass= NegativeLoginfunctionalityTestDATA.class,dataProvider="NegetiveTD",priority=1)
	public void NegetiveLogInFunctionalityInValidCredentialsTest1(String username,String password) { 
		 driver.findElement(By.name("userName")).sendKeys(username);
	     driver.findElement(By.name("password")).sendKeys(password);
	     driver.findElement(By.name("submit")).click();
	     WebElement loginErrorMsg = driver.findElement(By.xpath("//*[contains(text(),'password correct')]"));
	     Assert.assertTrue(loginErrorMsg.isDisplayed());
}
}
