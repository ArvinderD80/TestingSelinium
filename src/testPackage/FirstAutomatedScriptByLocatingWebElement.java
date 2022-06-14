package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomatedScriptByLocatingWebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		System.out.println("Title of home page: "+driver.getTitle());
		
		WebElement Usernametxt =driver.findElement(By.name("username"));
		
		Usernametxt.sendKeys("avidhillon_m@yahoo.com");
		Thread.sleep(1000);
		WebElement  Loginsigninbutton =driver.findElement(By.id("login-signin"));
		Loginsigninbutton.click();
		Thread.sleep(1000);
		driver.findElement(By.name("verify")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("code")).sendKeys("ZFZY");
		Thread.sleep(1000);
		driver.findElement(By.name("verify")).click();
		Thread.sleep(1000);
		driver.close();
	}

}  
