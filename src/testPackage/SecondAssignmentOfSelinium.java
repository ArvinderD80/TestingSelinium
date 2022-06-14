package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssignmentOfSelinium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println("Title of home page: "+driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kite");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        
        System.out.println("validation");
        String actualTitle= driver.getTitle();
        String expectedTitle = "Amazon.com : kite";
        if (actualTitle.equalsIgnoreCase(expectedTitle))
        	
        	{System.out.println("Test Passed");
        	}
        else 
        	{System.out.println("Test Unsuccessful");
	
        System.out.println(" Actual tile : "+actualTitle);
        }
        
        List<WebElement>   AllLinksInAPage =driver.findElements(By.tagName("a"));
        System.out.println("Number of links in a page :"  +AllLinksInAPage.size());
//       for (WebElement link: AllLinksInAPage) {
//   	   System.out.println( AllLinksInAPage. );
        }

	}


