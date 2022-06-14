package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arinder\\\\OneDrive\\\\Desktop\\\\New folder\\\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("");
		  driver.get("changes");
		  Thread.sleep(1000);

	}

} 
