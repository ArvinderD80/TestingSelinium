package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	 static WebDriver driver;
	 Actions action;
@BeforeTest
	
		 public void Initialization() {
			   System.setProperty("webdriver.edge.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\msedgedriver.exe"); 
			   driver =new EdgeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
			   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			   driver.get("https://www.amazon.com/");
			   driver.manage().deleteAllCookies();
}


@Test//(priority=5)
public void WorkingOfRadioButton() {
            driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']")).click();                
              

            WebElement Radiobutton1 = driver.findElement(By.xpath("//form[@id='international-customer-select-preferences-form']/div[1]/div[1]/div[2]/div/label/i"));
            Radiobutton1.click();
            System.out.println("Radiobutton(first) is clicked :"  +Radiobutton1.isEnabled());
          //  Assert.assertTrue(Radiobutton1.isEnabled());

            WebElement Radiobutton2= driver.findElement(By.xpath("//form[@id='international-customer-select-preferences-form']/div[1]/div[1]/div[3]/div/label/i"));
            Radiobutton2.click();
            System.out.println("Radiobutton(second) is clicked :"  +Radiobutton2.isEnabled());
           // Assert.assertTrue(Radiobutton1.isEnabled());
            driver.findElement(By.xpath("//form[@id='international-customer-select-preferences-form']/div[1]/div[1]/div[2]/div/label/i")).click();
            System.out.println("Radiobutton(first) is again clicked :"  +Radiobutton1.isEnabled());
          //  Assert.assertTrue(Radiobutton1.isEnabled());
            WebElement SubmitButton1 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
            SubmitButton1.click();
            System.out.println("save changes button clicked :"  +SubmitButton1.isEnabled());
          //  Assert.assertTrue(SubmitButton1.isSelected());
            
}
@Test
public void CheckingOptionsInDropDrown() {
	 WebElement allDropDown =driver.findElement(By.id("searchDropdownBox"));
     Select dropdownbox= new Select(allDropDown);
     allDropDown.click();

     dropdownbox.selectByIndex(2);

     dropdownbox.selectByVisibleText("Appliances");

     dropdownbox.selectByValue("search-alias=arts-crafts");

      action = new Actions(driver);
   
     action.moveToElement(allDropDown).click().build().perform();
     String actualURL=driver.getCurrentUrl();
     System.out.println("actualURL:"+actualURL);
     String ExpectedURL="https://www.amazon.com/";
     Assert.assertEquals(actualURL, ExpectedURL);
}

@Test
public void ClickingArrowToGetDifferentSlidesOnAPage() {
	WebElement arrow = driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));
	  action.moveToElement(arrow);
	 System.out.println( arrow.isSelected());
	  for(int i=1; i<=5; i++) {
      action.click().build().perform();
       }
	  Assert.assertTrue(arrow.isEnabled());
}

@Test
public void EnterDataInTabSearchandHitEnterKey() {
	 WebElement searchbox =  driver.findElement(By.id("twotabsearchtextbox"));
	 action.moveToElement(searchbox).doubleClick().sendKeys("Toys & Games").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	 action.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
	 action.sendKeys("Shop Newly Released Toys").keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();

	  WebDriverWait Explicitlywait =new WebDriverWait(driver,20);
	  WebElement kindlebooks = driver.findElement(By.linkText("Kindle Books"));
	  Explicitlywait.until(ExpectedConditions.elementToBeClickable(kindlebooks));
	  kindlebooks.click();
	  String actualTitle= driver.getTitle();
	   System.out.println(" Actual tile : "+actualTitle);
	   String expectedTitle ="Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
	   Assert.assertEquals(actualTitle, expectedTitle);
}

@Test
    public void EnterDataInTabSearchAndClick() {
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kite");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String actualTitle= driver.getTitle();
    System.out.println(" Actual tile : "+actualTitle);
    String expectedTitle ="Amazon.com : kite";
    Assert.assertEquals(actualTitle, expectedTitle);

}
@AfterTest
   public void Treardown() {
	driver.quit();
}
}