package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeXpathAndCssSelector {

	public static void main(String[] args) throws InterruptedException {
	
		//setting property of the system and creating an object of a driver referring to Webdriver parent class ( pollymorphism ), 
	   //then maximizing the window and loading the  application by provinding the URL 
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS//chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(1000);
	  
	  //  finding element and sending data in  username  field   
	  String username = "standard_user";
	  WebElement usernameelement = driver.findElement(By.xpath("//*[@id='user-name']"));
	  usernameelement.sendKeys(username);
	  
	  
//	  driver.findElement(By.cssSelector("id='user-name'"));// another way of finding the element 
	  Thread.sleep(1000);
	  
	  //finding element and sending data in  password  field  
	  String password = "secret_sauce";
	  WebElement passwordelement =  driver.findElement(By.xpath( "//input[@id='password']"));
	  passwordelement.sendKeys(password);
	  Thread.sleep(1000);
	  
	//  finding the element and clicking the submit button 
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  
	//verification 
	  String pagetitle = driver.getTitle();
	  System.out.println("USERNAME USED :  "+ username +"|"+"PASSWORD USED:  " + password + "   search page title:  "  +pagetitle);
	  String pageaurl = driver.getCurrentUrl();
	  System.out.println("USERNAME USED :  "+ username +"|"+"PASSWORD USED:  " + password + "   search page url:  "   +pageaurl);
	  
	 // WebElement NameAtoZ = driver.findElement(By.xpath("*//[@id='header_container']div[2]/div[2]/span/select"));// not working 
	 // WebElement NameAtoZ = driver.findElement(By.cssSelector(" # header_container > div.header_secondary_container > div.right_component > span > select"));
	  WebElement NameAtoZ = driver.findElement(By.className("product_sort_container"));
	  
	  Select passelect = new Select (NameAtoZ);
	  Thread.sleep(1000);
	  passelect.selectByValue("za");
	
	Thread.sleep(1000);
//	passelect.selectByIndex(3);
//	Thread.sleep(1500);
//	passelect.selectByIndex(2);
	Thread.sleep(1500);
//	driver.findElement(By.xpath("//img[@class='bm-icon']")).click();
	
	driver.findElement(By.xpath("//img[@class='inventory_item_img'][@alt='Sauce Labs Backpack']")).click();
	driver.getTitle();
	driver.get(pageaurl);
	Thread.sleep(2500);
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	Thread.sleep(2500);
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2500);
	driver.findElement(By.id("first-name")).sendKeys("Arvinder");
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Dhillon");
    driver.findElement(By.id("postal-code")).sendKeys("49003");
    Thread.sleep(3000);
	driver.findElement(By.name("continue")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("finish")).click();
	//taking screen short for verification 
	
	Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}

}
