package testNG;

import org.testng.annotations.DataProvider;

public class NegativeLoginfunctionalityTestDATA {
	@DataProvider
	public String[][] NegetiveTD() {
		   String[][]NegetivTD= {{"123","test12"},{"Test123","test12"}};
		   return NegetivTD;
	}
}
