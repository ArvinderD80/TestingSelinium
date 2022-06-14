package testPackage;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSINGMENTOFLOOPINGWEBTABLE {

	public static void main(String[] args) {
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/calendar/");
		System.out.println(driver.getTitle());
		
		 
		
//		List<WebElement>  cell1 = driver.findElements(By.xpath("//table[@id='mct1']/tbody/tr[2]/td[contains(@class,'c')]"));	
//		
//	
//	   System.out.println(" January |  February |  March  ");
//
//		WebElement t;
//		System.out.println(" January       |       February            |  March  ");
//		//System.out.println("extracting Rows"+cell1.size()+"\t"+"extracting text");
//		for(int i =0 ; i<cell1.size(); i++) {
//        	t = cell1.get(i);
//            System.out.println(t.getText());
//		}
//		WebElement s;
//		for(int i =0 ; i<=4; i++) {
//        	s = cell1.get(i);
//            System.out.println(s.getText());
//			
//			
//		}
//		
//		
//		System.out.println(" extracting number of( td=cell ) elements in sixth row tr(6) of the table"+cell2.size());
//		System.out.println(" extracting text of( td=cell ) elements in second row tr(2) of the table ");
//		System.out.println(" January |  February |  March  ");
//		List<WebElement> cell2 = driver.findElements(By.xpath( "//table[@id='mct1']/tbody/tr[6]/td[contains(@class,'c')] "));
//            System.out.println(cell2.size());
//            WebElement s1;
//            for (int i= 0 ; i<cell2.size(); i++) {
//            	       s1 = cell2.get(i);
//            	System.out.println(s1.getText());
//            }
		
		
		 
		
//	WebElement header= driver.findElement(By.xpath("//table[@id='ch1']/thead/tr/th[contains(text(),'Holidays and Observances:')]"));// header in the table 
//		 System.out.println("Table: "+header.getText());
		

//		WebElement WholeTable = driver.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table[1]/tbody"));
//                       System.out.println(WholeTable.getText());
//         String  TABLEcolumn1 = WholeTable.findElement(By.xpath("//tr[1]/td[1]/table/tbody/tr[1]/td[1]")).getText();//1 coloumn 
//         System.out.println("TABLEcolumn1:-----------------------------------------------------------------------");
//         System.out.println(TABLEcolumn1);
//         String TABLEcolumn2 = WholeTable.findElement(By.xpath("//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[4]")).getText();//2 column
//         System.out.println("TABLEcolumn2:-----------------------------------------------------------------------");
//         System.out.println(TABLEcolumn2);
//		 String TABLEcolumn3  =WholeTable.findElement(By.xpath("//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[7]")).getText();//3 column
//		 System.out.println("TABLEcolumn3:-----------------------------------------------------------------------");
//		 System.out.println(TABLEcolumn3);
		 
	//	 String td3 = WholeTable.findElement(By.xpath("//tr[1]/td[1]")).getText();
	//	 System.out.println(td3); not worked 
		// System.out.println("------------------# Finding nmbr of small tables within a  table  --------------");
//		 List<WebElement> table =driver.findElements(By.xpath("//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[@class='vt']"));// common 
//		 System.out.println("Number of cell( /td/tables/coloumns ) within a table  is  :"+table.size());
//		 System.out.println("-----------------Looping of cell( /td/tables/coloumns ) within a table to fetch all holidays in a year 2022 -------------"); 
//		 WebElement g;                                    //worked 
//		 for(int i=0; i<table.size();i++ ){
//			g=table.get(i);
//			 System.out.println(g.getText());
//		 }
//		 System.out.println("---------------------------------second method of looping ----------------------------------------------");
//		 for(WebElement  n :table) {
//			System.out.println(n.getText());
//		 }
//   WebElement colmn1 = driver.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table[1]/tbody"));
//			//body[1]/div[7]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]"));
//			                                             //table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/"));//1 column
//	       String td1 = colmn1.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]")).getText(); //td 1 in row 1
//	System.out.println("cell1 of a first Row:----------->  "+td1);
//	       String td2 = colmn1.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[2]")).getText(); //td 2 in row 1
//	System.out.println("cell2 of a first Row:----------->  "+td2);
//	System.out.println("td1"+"\t"+"td2");
//	System.out.println(td1+"\t "+td2);
//	        String  R1= colmn1.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[1]")).getText(); // row one in td 1 
//	System.out.println("First Row in a table :----------->   "+R1);
//	
//	 String Td1 = colmn1.findElement(By.xpath("//tr[1]/td[1]/table/tbody/tr[1]/td[1]")).getText();
//	 System.out.println("xpathused://tr[1]/td[1]/table/tbody/tr[1]/td[1]:-----resulted in whole table with all rows------> "+Td1);
//	 String Td2 = colmn1.findElement(By.xpath("//tr[1]/td[1]/table/tbody/tr[1]/td[2]")).getText();
//	 System.out.println("xpathused://tr[1]/td[1]/table/tbody/tr[1]/td[2]:-----resulted in only right cell------> "+Td2);
//	 System.out.println("-----------------------------LOOPING-with this td[2] xpath results are below-----------------------------------------------");
//	 for(int i=1;i<= 9;i++) {
//		 String R=Integer.toString(i);
//		 String RoW="//tr[1]/td[1]/table[1]/tbody[1]/tr["+R+"]/td[2]";
//		 String Row1=colmn1.findElement(By.xpath(RoW)).getText();
//		 System.out.println("Rows:"+i+": "+Row1);
//	 }
//	 System.out.println("-------//tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]\")).getText();------first row first cell-results are below -------------------");
//	 String cell1 = colmn1.findElement(By.xpath("//tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
//	 System.out.println( cell1);
//	 System.out.println("------------------------while  LOOPING- of first row first cell-results are below-----------------------------------------------");
//	     for(int i=1;i<= 9;i++) {
//		 String r1=Integer.toString(i);
//		 String RoW1="//tr[1]/td[1]/table[1]/tbody[1]/tr["+r1+"]/td[1]";
//		 String Rowfirst=colmn1.findElement(By.xpath(RoW1)).getText();
//		 System.out.println("Rows:"+i+": "+Rowfirst);
//	 }
//         String colmn1 = driver.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table[1]/tbody")).getText();
//                       System.out.println(colmn1);
//         String colmn2 = driver.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[4]/table/tbody")).getText();
//		               System.out.println(colmn2);
//		
//		 String colmn3 = driver.findElement(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[7]/table/tbody")).getText();
//		 System.out.println(colmn3);
		 //		 System.out.println("colmn1"+"\t\n"+"colmn2"+"\t\n"+"colmn3"+"\t\n");
//		 System.out.print(colmn1+"\t\n"+colmn2+"\t\n"+colmn3+"\t\n");
			
		
		
		
//		String colmn2 = "//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[4]";//2 column
//		String colmn3  ="//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[7]";//3 column
//		String  R1= "//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr[1]"; // row one in td 1 
//		String  td1 = "//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]"; //td 1 in row 1 
//		String  td2 = "//table[@id='ch1']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[2]"; //td 2 in row 1 
		
//List< WebElement> colmn1=driver.findElements(By.xpath("//table[@id='ch1'][@class='ch1 cl1h cd2 ch']/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/table[1]/tbody/tr"));//recognizing all rows in first tdof first row of table 2means column 2 of a table 
//Question ---why can't we cant  loop all the rows in table if we found them  
		 
//        driver.close();
	}

}
