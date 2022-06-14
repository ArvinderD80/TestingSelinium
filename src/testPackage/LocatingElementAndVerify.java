package testPackage;


    
    import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;

public class LocatingElementAndVerify {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arinder\\\\OneDrive\\\\Desktop\\\\New folder (2)\\\\DRIVERS\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		
		WebElement drpdpassenger = driver.findElement(By.name("passCount"));
				//(By.xpath("//select[contains(@name,'passCount')]/parent::b)"));
				////tbody/tr[3]/td[2]/b[1]/select[1]
				//(By.xpath("//tbody/tr[3]/td[2]/b/select[@name='passCount']"));
        		  //(By.xpath("//tbody/tr[3]/td[2]/b/select[@name='passCount']"));
        		  //(By.xpath("//select[@name='passCount']"));
                  //(By.name("passCount"));
	      Select select1 = new Select(drpdpassenger);
          List<WebElement> allOptionsdrpdpassenger = select1.getOptions();
          for(WebElement dropdownPlist: allOptionsdrpdpassenger) {
          System.out.println(dropdownPlist.getText());
          }
          WebElement departing = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/select[@name='fromPort']")); //(By.name("fromPort"));
          Select select2 = new Select(departing);
          List<WebElement> departptions = select2.getOptions();
          for(WebElement dropdownlist: departptions) {
          System.out.println(dropdownlist.getText());
          }
          WebElement drpdfromMonth = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[@name='fromMonth']")); //(By.name("fromMonth"));
	      Select select3 = new Select(drpdfromMonth);
          List<WebElement> allOptionsfromMonth = select3.getOptions();
          
          for(WebElement dropdownlist: allOptionsfromMonth) {
          System.out.println(dropdownlist.getText()+dropdownlist.getAttribute("value"));
          }
          
	       System.out.println("Current URL of flightlink page :"+driver.getCurrentUrl());
	       String currtURL= driver.getCurrentUrl();
	       String expurl= "https://demo.guru99.com/test/newtours/reservation.php";
	       System.out.println( "FLight URLlink fuinctionality "  +currtURL.equals(expurl));
	       
	       
		   WebElement newtourslink = driver.findElement(By.partialLinkText("New Tours"));
	       newtourslink.click();
	       System.out.println("Title of the HomePage :"+driver.getTitle()+" | "+ "CUrrent URL of Home Page :"+driver.getCurrentUrl());
		
	       System.out.println("LIST OF LINKS ON CURRENT PAGE :");
		   List<WebElement> listOfAllLinksInAPage = driver.findElements(By.tagName("a"));
           for(WebElement ListOFAllLinks: listOfAllLinksInAPage) {
    	   String LISTOFLINKS= ListOFAllLinks.getText();
    	   System.out.println(LISTOFLINKS);
	       }
           System.out.println("src of all images on a page :");
           List<WebElement>Allimg= driver.findElements(By.tagName("img"));
           for(WebElement ListOFAllimg: Allimg) {
    	   String allIMAGES=  ListOFAllimg.getAttribute("src");
    	   System.out.println(allIMAGES);
	       }
          
	       driver.close();
}
}
//http://demo.guru99.com/test/delete_customer.php
// System.out.println("Assignment of handling dropdown in the form of arraylist");
//  driver.findElement(By.linkText("Flights")).click();
// driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
// driver.findElement(By.name("cusid")).sendKeys("avi");
// Thread.sleep(3000);
//driver.findElement(By.name("submit")).click();
