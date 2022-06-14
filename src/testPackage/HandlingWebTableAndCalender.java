package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableAndCalender {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/calendar/");
		System.out.println("Title of the page : "+driver.getTitle());
	  
		
	     WebElement JanTable =  driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[1]/table/tbody")); //body of jan table
	    
	     String jan = JanTable.findElement(By.xpath("//tr[2]/td[7]")).getText();
	     System.out.println("jan Date : "+jan);//1jan
	     
	    String Jan8= "8";
	    String January8 = JanTable.findElement(By.xpath("//tr[3]/td[7]")).getText();
	    System.out.println("jan Date : "+January8);//8jan
	    if(Jan8.equals(January8)) {
	    	System.out.println("verification point :correct date fetched in  Jan table");}
	    else {
	    	System.out.println("wrong  date fetched in jan table ");
             }
	     System.out.println("-------looping to get date  8 jan from 1 jan---------");
	     for(int i=3; i<=7;i++) {         //starting row and counting   down upto  rows in which element is present ()
	    	 for (int j = 1; j<=7;j++) {  //td from left to right 
    		     String Row= Integer.toString(i);
	    		 String Column = Integer.toString(j);
	    		 String desireddate = JanTable.findElement(By.xpath("//tr["+Row+"]/td["+Column+"]")).getText(); 
	    		 if (desireddate.equals(Jan8)) {
	    			 System.out.println(desireddate);
	    			  break;
	    		 }
	    	        }
	    	    }
	     
	     WebElement FebTable =  driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[3]/table/tbody")); //body of Feb table
	     
	      String  fifthfeb=  FebTable.findElement(By.xpath("//td[3]/table/tbody/tr[2]/td[7]")).getText();
	      System.out.println("Feb Date : "+fifthfeb);//5feb
	     
	     String expecteddate = "9";
	     String desiredDate =  FebTable.findElement(By.xpath("//td[3]/table/tbody//tr[3]/td[4]")).getText();//9
	     System.out.println("Feb Date  : "+desiredDate);//9
	     
	     
	     
	     System.out.println("-------looping to get date  9 feb from 5 feb--------");
	     for (int i=4; i<=7; i++ ) {
	    	 for(int k=1; k<=7;k++ ) {
	    	String r=	 Integer.toString(i);
	    	String c =    Integer.toString(k);
	    	 String desiredD =  FebTable.findElement(By.xpath("//tr["+r+"]/td["+c+"]")).getText();
	    	 if (desiredD.equals(expecteddate)) {
	    	 System.out.println(desiredD);
	    	 break;
	     }
	    	 }
	    	 
	     }
	     WebElement MarchTable =  driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[5]/table/tbody")); //body of March table
	                  
	     String seven =  MarchTable.findElement(By.xpath("//td[5]/table/tbody/tr[3]/td[2] ")).getText();//7march
	                   System.out.println("March Date : "+seven);//3 in result 
	                   
	     String ExpectedMDate =MarchTable.findElement(By.xpath("//td[5]/table/tbody/tr[3]/td[7] ")).getText();//12
	     System.out.println("March Date "+ExpectedMDate);
	     
	    
	     String expctddate = "12";
	     String  march12 = MarchTable.findElement(By.xpath("//td[5]/table/tbody/tr[3]/td[7]")).getText(); 
	     System.out.println("March Date :"+march12);//12
	     
	     System.out.println("looping to get date  12 march from 8 march");
	     for(int i =3;i<=7;i++) {
	     for(int j =1;j<=7;j++)	{
	    	String Row =Integer.toString(i);
	    	String Coloumn = Integer.toString(j);
	    String DDate=MarchTable.findElement(By.xpath("//td[5]/table/tbody/tr["+Row+"]/td["+Coloumn+"]")).getText();
	    	if(expctddate.equals(DDate)) {
	    		System.out.println(DDate);
	    	}
	    } 
	     }
	    WebElement AprilTable = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[6]/td[1]/table/tbody"));//april body 
	     
	    String Twentysix = AprilTable.findElement(By.xpath("//tr[6]/td[1]/table/tbody/tr[6]/td[3]")).getText();
	     System.out.println(Twentysix);
	     
	     String expD= "30";
	     String ExpD = AprilTable.findElement(By.xpath ("//tr[6]/td[1]/table/tbody/tr[6]/td[7]")).getText();//15
	     System.out.println(ExpD);
	    
	     System.out.println("----------looping  of webtable element to get date 15 april from 26 april ------------");
	     for (int i = 6 ; i<= 7; i++) {
	    	 for (int j =1; j<=7;j++) {
	    		String Row = Integer.toString(i);
	    		String coloumn = Integer.toString(j);
	    		String DesiredDate = AprilTable.findElement(By.xpath ("//td[1]/table/tbody/tr["+ Row +"]/td["+ coloumn +"]")).getText();
	    		if (expD.equals(DesiredDate)) {
	    			System.out.println(DesiredDate);
	    		}
	    		}
	     }
	     driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
	     
	     
	    
	  WebElement offerTable = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]"
	   		               + "/table[1]/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[1]/p/img/following::table[1]/tbody[1]/tr[3]/td/table/tbody"));
	    
	  String destination = offerTable.findElement(By.xpath("//tr[3]/td/table/tbody/tr[1]")).getText();//row1
	    		
	    System.out.println("Getting first row :"+"\t"+destination+"\t");
	   
	    String Destint = offerTable.findElement(By.xpath("//tr[3]/td/table/tbody/tr[1]/td[1]")).getText();//row1,td1
	    System.out.println("Getting first colomn :"+Destint);
	    
	    String offeramnt =offerTable.findElement(By.xpath("//tr[3]/td/table/tbody/tr[1]/td[2]")).getText();//row1,td2
	    System.out.println("Gtting  second colomn of first row :"+offeramnt);
	  

	 
	    List<WebElement> offrTableRows = offerTable.findElements(By.tagName("tr"));// for looping webtable 
	   
 System.out.println("----- looping Traversing through rows and coloumns of  webtable (method1)-------------");
	    List<WebElement> colmn = null;
	    for( WebElement Rows: offrTableRows ) {
		  System.out.println();
		  colmn =Rows.findElements(By.tagName("td"));
		   for(WebElement C:colmn ) {
			  System.out.println(C.getText()+"\t");
		  }
		  }
	  

 System.out.println("----- looping Traversing through rows and coloumns of  webtable (method2)-------------");
	  List<WebElement> offrTablRows = offerTable.findElements(By.tagName("td"));
	     for(int i=0; i<offrTablRows.size(); i++){
		    System.out.println(offrTablRows.get(i).getText());
		   }
	  
	  
	  
 System.out.println("----- looping Traversing through rows and coloumns of  webtable (method3)-------------");
	 
	  List<WebElement> Ro= offerTable.findElements(By.xpath("//tr[3]/td/table/tbody/tr"));//5 cell total
	    System.out.println("numbers of rows in a table :"+Ro.size());
	  List<WebElement> cl= offerTable.findElements(By.xpath("//tr[3]/td/table/tbody/tr[1]/td"));
	    System.out.println("numbers of colomns  in a table :"+cl.size());
	   	  
	     for (int i= 1;i<=Ro.size(); i++) {
	    	 for(int j=1;j<=cl.size();j++) {
	    		String row = Integer.toString(i);
	    		String colomns= Integer.toString(j);
	    	System.out.println(offerTable.findElement(By.xpath("//tr[3]/td/table/tbody/tr[" + row + "]/td["  + colomns + "]")).getText());
	    		 }
	    	    System.out.println();
	           }
	          
	
	 driver.close();
	} 
	 
}


	 

	    	 
	    
	     
 
//	       driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[1]/table/tbody/tr[2]"));   //first row in a table "));
//	       driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[7]"));//jan1
//	         List <WebElement> r = driver.findElements(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[contains(@class,'cbm cba tc cmi')]"));//result jan,feb,march table of same row 
//             for(WebElement R : r) {                                                                                                     ( @class,'c')-->result jan1
//	          System.out.println(R.getText());}
	     // to find out yet 
//int destinion = offerTable.findElements(By.xpath("//tr[3]/td/table/tbody/tr")).size();//5 
//System.out.println(destinion);
//int offramnt =offerTable.findElements(By.xpath("//tr[3]/td/table/tbody/td")).size();//
//System.out.println(offramnt);
//List<WebElement> dastination = offerTable.findElements(By.tagName("tr"));//5rows total
//List<WebElement> oframt=offerTable.findElements(By.xpath("//tr[3]/td/table/tbody/td"));
// for(int i=1; i<=dastination.size(); i++){
//	   List<WebElement> colRows =offerTable.findElements(By.tagName("tr"));
//	   for(int j=1; j<=oframt.size(); j++){
//	   		System.out.println(colRows.get(j).getText());
//	   		
//	   	}
//	   
//	   }
	
	

