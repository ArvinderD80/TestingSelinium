package testPackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Configurationfilesclass {
	    static  WebDriver driver;
	public static void main(String[] args) throws IOException {
	  
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Arinder\\eclipse-workspace\\TestingSelenium\\src\\testPackage\\config.properties");
		prop.load(fis);
		
		String Browser = prop.getProperty("Browser");
		
		if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty(prop.getProperty("chromekey"),prop.getProperty("chromepath"));
        driver =new ChromeDriver();
 
		}
		 
		else if (Browser.equalsIgnoreCase("gecko")) {
    		System.setProperty(prop.getProperty("firefoxkey"),prop.getProperty("firefoxpath"));
            driver =new FirefoxDriver();
        }
		else if (Browser.equalsIgnoreCase("edge")) {
    		System.setProperty(prop.getProperty("edgekey"),prop.getProperty("edgepath"));
            driver =new EdgeDriver();
        }
		else if (Browser.equalsIgnoreCase("ie")) {
    		System.setProperty(prop.getProperty("iekey"),prop.getProperty("iepath"));
            driver =new InternetExplorerDriver();
        }
		
        else {
        	System.err.println("drivers are not found");
        }
	       driver.manage().window().maximize();
	        String pageload= prop.getProperty("Pageloadtimeout");
	        int Pageloadint=Integer.valueOf(pageload);
	        driver.manage().timeouts().pageLoadTimeout(Pageloadint,TimeUnit.SECONDS);
	        String implicitwaittimeout= prop.getProperty("implicitwaittimeout");
	        int implicitwaitint=Integer.valueOf(implicitwaittimeout);
	        driver.manage().timeouts().implicitlyWait(implicitwaitint, TimeUnit.SECONDS);
		   driver.get(prop.getProperty("Urlsaucedemo"));
		   
		   driver.manage().deleteAllCookies();
		   driver.close();
	}

}
