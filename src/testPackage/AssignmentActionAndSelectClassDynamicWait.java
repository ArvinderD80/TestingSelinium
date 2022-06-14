package testPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentActionAndSelectClassDynamicWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		driver.get("https://www.saucedemo.com/");
		driver.manage().deleteAllCookies();

         
		  String title = driver.getTitle();
		  System.out.println("Title of the page :  "+title); 
		  
		  Actions action = new Actions(driver);
		  WebElement usernameform =driver.findElement(By.xpath("//form/div/input[@id='user-name']"));
				                                            //driver.findElement(By.id("user-name"));
		
		  action.moveToElement(usernameform).doubleClick().sendKeys("standard_user").build().perform();
		//  Thread.sleep(3000);
		  WebElement password = driver.findElement(By.xpath("//form/div[2]/input[@id='password']"));
		  action.moveToElement(password).doubleClick().sendKeys("secret_sauce").build().perform();
				  //By.id("password"))).sendKeys("secret_sauce").build().perform();
		//  Thread.sleep(1000);
		  action.moveToElement(driver.findElement(By.id("login-button"))).click().build().perform();
		//  Thread.sleep(1000);
		  for(int i=1; i<=2; i++) {
              action.sendKeys(Keys.PAGE_DOWN).build().perform();
          //    Thread.sleep(2000);
             }
		  List< WebElement> dropdn=  driver.findElements(By.xpath("//select[@class='product_sort_container']"));
		  for(WebElement D :dropdn)
		  System.out.println(D.getText());
		  WebElement d= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		  Select select1 = new Select(d);
          List<WebElement> allOptionsdrpd = select1.getOptions();
          for(WebElement dropdownlist: allOptionsdrpd) {
          System.out.println(dropdownlist.getText());
          }
		  
		  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		  driver.navigate().to("https://www.amazon.com/");
		  driver.manage().deleteAllCookies();
		  System.out.println(driver.getCurrentUrl());
	      WebElement arrow = driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));//("//i[@class='a-icon a-icon-next-rounded']")
		  action.moveToElement(arrow);
		  for(int i=1; i<=5; i++) {
            action.click().build().perform();
        //   Thread.sleep(2000);
           }
		  WebElement searchbox =  driver.findElement(By.id("twotabsearchtextbox"));
		 
		  action.moveToElement(searchbox).doubleClick().sendKeys("Toys & Games").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//  Thread.sleep(1000);
		  action.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		  action.sendKeys("Shop Newly Released Toys").keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
	
		  WebDriverWait Explicitlywait =new WebDriverWait(driver,20);
		  WebElement kindlebooks = driver.findElement(By.linkText("Kindle Books"));
		  Explicitlywait.until(ExpectedConditions.elementToBeClickable(kindlebooks));
		  kindlebooks.click();
		  
		 //handling drag and drop 
          driver.navigate().to("https://jqueryui.com/droppable/");
          WebElement iframe = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
          driver.switchTo().frame(iframe);
          
        
         
         WebElement dragableObj = driver.findElement(By.id("draggable"));
         WebElement dropableObj = driver.findElement(By.id("droppable"));
          
         action.doubleClick().clickAndHold(dragableObj).moveToElement(dropableObj).release().build().perform();

  //       action.moveToElement(dragableObj).clickAndHold().moveToElement(dropableObj).release().build().perform();
   
  //          action.dragAndDrop(dragableObj, dropableObj).build().perform();
           
		  driver.close();

		  

		 
	}

}
