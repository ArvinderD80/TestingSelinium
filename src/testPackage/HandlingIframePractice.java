package testPackage;

//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class HandlingIframePractice {

	public static void main(String[] args) throws InterruptedException {
	

//		  System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\Arinder\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
//		  WebDriver driver = new ChromeDriver();
//		  driver.get("https://jqueryui.com/droppable/");
//		
//		// handling Iframe
//		  driver.get("https://jqueryui.com/droppable/");
//	      List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//	      System.out.println(iframes.size());
//	      driver.switchTo().frame(0);
////	      WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
////	      driver.switchTo().frame(iframe);
//	      	      
//	      Actions action = new Actions(driver);
//	      WebElement draggableObject = driver.findElement(By.xpath("//div[@id='draggable']"));
//	      WebElement dropLocation = driver.findElement(By.id("droppable"));
	      
	 // #1
//	      Thread.sleep(3000);
//	      action.dragAndDrop(draggableObject, dropLocation).build().perform();
//	      
	// #2
	     // action.moveToElement(draggableObject).clickAndHold().build().perform();
	     // Thread.sleep(3000);
	     // action.moveToElement(dropLocation).release().build().perform();
	      
	// #3
//	     action.moveToElement(draggableObject).clickAndHold().moveToElement(dropLocation).release().build().perform();
//	     Thread.sleep(3000);
//	     driver.close();
	     } 
//
	}


