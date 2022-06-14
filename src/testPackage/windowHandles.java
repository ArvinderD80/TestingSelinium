package testPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		System.out.println("Title of home page: "+driver.getTitle());
		driver.findElement(By.name("cusid")).sendKeys("avi");
	     
	      driver.findElement(By.name("submit")).click();
	      //handling pop up message
	      String firstAlertmessage= driver.switchTo().alert().getText();
	      System.out.println("first alert message: "+firstAlertmessage);
	      driver.switchTo().alert().accept();
	     
	      String secondAlertmessage= driver.switchTo().alert().getText();
	      System.out.println("Second alert message: "+secondAlertmessage);
	      driver.switchTo().alert().accept();
	      
	      driver.findElement(By.name("cusid")).sendKeys("avi");
	      driver.findElement(By.name("submit")).click();
	    
	      driver.switchTo().alert().dismiss();
	      
	   // handling window 
	      driver.navigate().to("http://the-internet.herokuapp.com/windows");
	      System.out.println("Page title: "+driver.getTitle());
	      System.out.println("window handle of the start  page :"+driver.getWindowHandle());
	      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	      
	 //   driver.findElement(By.xpath("//a[@target='_blank'][ @xpath='1']")).click();   //(found  matching element in chropath but not worked in script.)
	      driver.findElement(By.linkText("Click Here")).click();                          // (link worked) 
	      
	      Set<String>handles=driver.getWindowHandles();
	      System.out.println("Number of window opened : " +handles.size());
	     
	      
	 //  driver is switching  to new  window to get the handle of new windows .
	      for (String handle :handles){
	      System.out.println(handle);
	       driver.switchTo().window(handle);
	       }
	      
	 // in order to grab the handle of n number of opened windows regardless  getting title  and switching back and forth .
	      
	      Iterator<String> itratr=handles.iterator();
	      String parentWindowahandle=itratr.next();
	      String ChildWindowHandle=itratr.next();
	      System.out.println("Parent window Handle : "+parentWindowahandle);
	      System.out.println("Child window Handle : "+ ChildWindowHandle);
	      
	// switching  windows back and forth and having the titles printed for the verification purpose 
	      driver.switchTo().window(ChildWindowHandle);             
	      System.out.println("Child window title : "+driver.getTitle());
	      
	      driver.close();
	      driver.switchTo().window(parentWindowahandle);
	     
	      driver.close();
	      
	      while (itratr.hasNext()){
	    	   driver.switchTo().window(itratr.next());
	           System.out.println( "window title :"+driver.getTitle());
	           System.out.println(driver.getCurrentUrl());
	           driver.close();
	           
	      }
	      
	}

}
