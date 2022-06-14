package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNGTests.PositiveLoginFunctionalityTestDATA;

public class LOGInFUNCTIONALITyTEST {
	
	WebDriver driver;
//	@BeforeTest
	@BeforeMethod
	 public void Initialization() {
		   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arinder\\\\OneDrive\\\\Desktop\\\\New folder (2)\\\\DRIVERS\\\\chromedriver.exe"); 
		   driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   driver.get("https://demo.guru99.com/test/newtours/index.php");
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
	@Test (dataProviderClass=PositiveLoginFunctionalityTestDATA.class,dataProvider="PositiveLoginFunctTest",priority=0)
	public void PositiveLogInFunctionalityValidCredentialsTest1(String username,String password) { 
	 driver.findElement(By.name("userName")).sendKeys(username);
     driver.findElement(By.name("password")).sendKeys(password);
     driver.findElement(By.name("submit")).click();
     WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
     String actualLoginSuccessMsg = loginSuccessMsg.getText();
     String expectedLoginSuccessMsg = "Login Successfully";
     Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
}
	@Test(enabled=false) 
	public void PositiveLogInFunctionalityValidCredentialsTest2() { 
	 driver.findElement(By.name("userName")).sendKeys("Avi");
     driver.findElement(By.name("password")).sendKeys("navi");
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
	@Test(enabled=false)
	public void NegetiveLogInFunctionalityInValidCredentialsTest2() { 
		 driver.findElement(By.name("userName")).sendKeys("123");
	     driver.findElement(By.name("password")).sendKeys("test12");
	     driver.findElement(By.name("submit")).click();
	     WebElement loginErrorMsg = driver.findElement(By.xpath("//*[contains(text(),'password correct')]"));
	     Assert.assertTrue(loginErrorMsg.isDisplayed());
}
//   @DataProvider(name="PositiveLoginFunctTest")
//   public String [][] PositiveTD() {
//	   String[][] PositivTD = {{"Avi","navi"},{"test123","123"}};
//	   return PositivTD;
//   }
//   @DataProvider
//   public String[][] NegetiveTD() {
//	   String[][]NegetivTD= {{"123","test12"},{"Test123","test12"}};
//	   return NegetivTD;
//   }
}