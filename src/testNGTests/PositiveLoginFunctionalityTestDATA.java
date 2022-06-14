package testNGTests;

import org.testng.annotations.DataProvider;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.edge.EdgeDriver;

public class PositiveLoginFunctionalityTestDATA {
	

	 @DataProvider(name="PositiveLoginFunctTest")
public String [][] PositiveTD() {
	   String[][] PositivTD = {{"Avi","navi"},{"test123","123"}};
	   return PositivTD;
}

	
	}	

