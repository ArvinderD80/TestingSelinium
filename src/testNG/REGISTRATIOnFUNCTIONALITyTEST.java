package testNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class REGISTRATIOnFUNCTIONALITyTEST {
	 static WebDriver driver;
	
//@BeforeTest
 @BeforeMethod
	 public void Initialization() {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\msedgedriver.exe"); 
		   driver =new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		   driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS );
		   driver.get("https://demo.guru99.com/test/newtours/index.php");
		   driver.manage().deleteAllCookies();
		   driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		   }
// @BeforeMethod
//	 public void registerlinkclick() {
//	 driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
//	 }
//	
	
@AfterTest //close the browser once after  execution of all tests done 
	 public void teardown() {
	   driver.close();
	 }
	 
@AfterMethod
         public void gotohomepage() {
		 driver.findElement(By.linkText("Home")).click();
	 }
@Test (priority=0) 
	 public void positiveregistrationfunctionalityClickandValidateTEST1() {
	   //  driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 String expectedurl="https://demo.guru99.com/test/newtours/register.php";
		 Assert.assertEquals(currenturl, expectedurl,"Correct url");
	 }

@Test(dataProvider="positiveRegistrationFunctionalityProvideDataandValidateTEST2",priority=1)
	 public void positiveRegistrationFunctionalityProvideDataandValidateTEST2(String password, String email,String confirmPassword ) {
	  //  driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    driver.findElement(By.cssSelector("#email")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
//	    String actualurl=driver.getCurrentUrl();
//	    System.out.println(actualurl);
//	    String Expectedurl= "https://demo.guru99.com/test/newtours/register_sucess.php";
//	    Assert.assertEquals(actualurl, Expectedurl,"Registration successful");
	    Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
//        WebElement ActualText = driver.findElement(By.xpath("//b[contains(text(),'Avi.')]"));FAILED: positiveregistrationfunctionalityPuttingDataandValidateTEST2
//	    java.lang.AssertionError: Registration successful expected [Note: Your user name is Avi.] but found [[[EdgeDriver: msedge on WINDOWS (8c0981646a27cc36b1f3b4829bc68c0b)] -> xpath: //b[contains(text(),'Avi.')]]]
//        String ExpectedText= "Note: Your user name is Avi.";
//        Assert.assertEquals(ActualText, ExpectedText,"Registration successful");
	    
		 }
		 
@Test
	 public void NegativeRegistrationFunctionalityWithNoDataAndSubmitTEST1() {
	     
		// driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
//		 String actualurl=driver.getCurrentUrl();
//		 System.out.println(actualurl);
//		 String expectedurl= "https://demo.guru99.com/test/newtours/register_sucess.php";
// 		 Assert.assertEquals(actualurl, expectedurl);
 		 Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	 }
@Test(dataProvider="NegativeRegistrationFunctionality",dependsOnMethods="NegativeRegistrationFunctionalityWithNoDataAndSubmitTEST1")
	 public void  NegativeRegistrationFunctionalityWithMismatchDataAndSubmitTEST2(String password,String email,String confirmpassword) {
	      //  driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	        driver.findElement(By.cssSelector("#email")).sendKeys(email);
		    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
		    WebElement ActualText= driver.findElement(By.xpath("//span[contains(text(),'PAssword and con.password does not match')]"));
		    System.out.println(ActualText.isDisplayed());
		    Assert.assertTrue(ActualText.isDisplayed());	
	 }
@Test(enabled=false)
    public void  NegativeRegistrationFunctionalityWithMismatchDataAndSubmitTEST3(String password,String email,String confirmpassword) {
	     //   driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
            driver.findElement(By.cssSelector("#email")).sendKeys(email);
            driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
            driver.findElement(By.xpath("//input[@name='submit']")).click();
            WebElement ActualText= driver.findElement(By.xpath("//span[contains(text(),'PAssword and con.password does not match')]"));
		    System.out.println(ActualText.isDisplayed());
		    Assert.assertTrue(ActualText.isDisplayed());
}	    
		    
@DataProvider

public String[][] NegativeRegistrationFunctionality () {
	String[][] NegRegFunctionality = {{"Avi", " ","navi"},{"Avi","navi"," "},{"Avi", "p","navi"},{"Avi","navi","k"}};      
		 return NegRegFunctionality ;
		    }
@DataProvider(name="positiveRegistrationFunctionalityProvideDataandValidateTEST2")
public String[][] positiveRegistrationFunctionality () {
	String[][] PostRegFunctionality = {{"navi", "Avi","navi"},{"test123","123","123"}};      
		 return PostRegFunctionality ;
		    }
}


//            WebElement ActualText= driver.findElement(By.xpath("//span[contains(text(),'PAssword and con.password does not match')]"));
//            String expectedText=  "PAssword and con.password does not match";
//            Assert.assertEquals(ActualText, expectedText,"Registration unsuccessful");}
//            Registration unsuccessful expected [PAssword and con.password does not match] but found [[[EdgeDriver: msedge on WINDOWS (3e229eb56829655895e09e336ea0cb98)] 
//		-> xpath: //span[contains(text(),'PAssword and con.password does not match')]]
