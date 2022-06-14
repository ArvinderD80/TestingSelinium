package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstTestNGscript {
	
@Test
public void Registrationfunctionality() {
	
	
	
	
	
	
	
}
	
  @Test
  public void positiveloginfunctionality() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe"); 
	   WebDriver driver =new ChromeDriver();
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
//	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	   driver.get("https://demo.guru99.com/test/newtours/index.php");
	   
	   driver.findElement(By.name("userName")).sendKeys("test123");
	   driver.findElement(By.name("password")).sendKeys("123");
	   driver.findElement(By.name("submit")).click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	   //verifying 
	  String actualpagetitle= driver.getCurrentUrl();
	  System.out.println(actualpagetitle);
	  String Expectedpagetitle = "https://demo.guru99.com/test/newtours/login_sucess.php";
	   if (actualpagetitle.equals(Expectedpagetitle)) {
		   System.out.println("positiveloginfunctionality : Test passed");
	   }
	  else {
		   System.out.println("positiveloginfunctionality : Test failed");
	   }
	   System.out.println("after verification point");
	   //validating 
	   Assert.assertEquals(actualpagetitle, Expectedpagetitle);
	   WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
       String actualLoginSuccessMsg = loginSuccessMsg.getText();
       System.out.println(actualLoginSuccessMsg);
       String expectedLoginSuccessMsg = "Login Successfully";
       Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
       Assert.assertTrue(true, expectedLoginSuccessMsg);
       Assert.assertFalse(false);
	  driver.close();
}
  
  
  @Test 
  public void negativeloginfunctionality() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe"); 
	   WebDriver driver =new ChromeDriver();
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
//	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	   driver.get("https://demo.guru99.com/test/newtours/index.php");
	   
	   driver.findElement(By.name("userName")).sendKeys("est123");
	   driver.findElement(By.name("password")).sendKeys("123");
	   driver.findElement(By.name("submit")).click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	   //verifying
	   
	   WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
	   String actualErrorMsg = loginErrorMsg.getText();
	      System.out.println(actualErrorMsg);
	   String ExpectedErrormsg="Enter your userName and password correct";
	   if (loginErrorMsg.isDisplayed()) {
		   System.out.println("negativeloginfunctionality : Test passed");
	   }
	  else {
		   System.out.println("negativeloginfunctionality : Test failed");
	   }
	   System.out.println("after verification point");
	   //validating 
	   Assert.assertTrue(loginErrorMsg.isDisplayed());
	   Assert.assertEquals(actualErrorMsg, ExpectedErrormsg);
       Assert.assertTrue(true, actualErrorMsg);
       Assert.assertFalse(false);
	  
	  
	  
	  
  }
}
