package testPackage;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfLocatingElementBYXpathandCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    
      // driver.get("https://demoqa.com/text-box");
      // System.out.println("Start page title : "+driver.getTitle() +"|"+  "Current URL of the page : "+driver.getCurrentUrl());
    
//       driver.findElement(By.xpath("//div[@id='userName-wrapper']/div/label[contains(text(),'Full ')]")).click();//start with child xpath and parent and then grandparent(Grandparent/parent/child xpath )  
//       //(By.xpath("//label[contains(text(),'Full ')]")).click(); //using text method  with  its partial text value alongwith contains 
//       //(By.xpath("//div[@id='userName-wrapper']/div/label[contains(text(),'Full ')]"));
//         WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));  ////div[@id='app']/div[6]/div[1]/ul[1]/li[1]
//         System.out.println(text.getText());
//         WebElement checkBox= driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li"));
//         System.out.println(" First Webelement in a list   "+checkBox.getText());
//         WebElement RadioButton=driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[1]"));
//         System.out.println(RadioButton.getText());
//         WebElement WebTables = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[2]"));
//         System.out.println(WebTables.getText());
//         WebElement Buttons = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[3]"));
//         System.out.println(Buttons.getText());
//         WebElement Link= driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[4]"));
//         System.out.println(Link.getText());
//         WebElement BrokenLinksImages =driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[5]"));
//         System.out.println(BrokenLinksImages.getText());
//         WebElement Uploadanddownload=driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[6]"));
//         System.out.println(Uploadanddownload.getText());
//         WebElement  Dynamicprop=driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[7]"));
//         System.out.println(Dynamicprop.getText());
//         WebElement Forms= driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[8]"));
//         System.out.println(Forms.getText());
//         WebElement Alerts= driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[9]"));
//         System.out.println(Alerts.getText());
//         WebElement Widgets  =driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[10]"));
//         System.out.println(Widgets.getText());
//         WebElement Interactions  =driver.findElement(By.xpath("//span[contains(text(),'Text Box')]/ancestor::li/following::li[11]"));
//         System.out.println(Interactions.getText());
//         WebElement GoingDown =driver.findElement(By.xpath("//span[contains(text(),'Buttons')]/ancestor::li/following::li[3]"));
//         System.out.println("This is jumping from button webelement to Upload and download  "+GoingDown.getText());
//         WebElement MovingUP = driver.findElement(By.xpath("//span[contains(text(),'Buttons')]/ancestor::li/preceding::li[4]"));
//         System.out.println("This is jumping  back from button weblement to first text box  "+MovingUP.getText());
//         WebElement toolQa =driver.findElement(By.xpath("//span[contains(text(),'Buttons')]/ancestor::li/preceding::header/a[1]/img[1]"));//span[contains(text(),'Buttons')]/ancestor::li/preceding::header/a/img
//         
//         toolQa.click();
     // System.out.println(toolQa.getSize()); // throws stale element exception if i use this line
         
          driver.navigate().to("https://www.ebay.com/");
//         System.out.println("--------finding list of all lists by tagname li in a page----------------------------------------");
          System.out.println(" text of lists in a page"+"\t"+"numbers of elements of li");
         List<WebElement> listofelements = driver.findElements(By.tagName("li"));
//         		////*[@id='s0-0-32-4-0-0[4]-4-match-media-0-ebay-carousel-list']/child::li"));
              System.out.println(listofelements.size());
         for(WebElement Listofelements: listofelements) {
      	     String elementsinalist= Listofelements.getText();
      	     System.out.println(elementsinalist);//+"\t"+listofelements.size());
//            }
//         System.out.println("Here printing all text that are in header-------------------------------------------------------");
//         
//         List<WebElement> Header=  driver.findElements(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[contains(@class,'gh-hide-if-nocss')]"));//not fetching brand outlet,WatchList,cart
//         		//*[@id='mainContent']/ancestor::body/header/div[1]/ul[contains(@id,'gh-topl')]"));worked with id but first ul list apperars only in a header//one element is not fetching (brand outlet)
//                 for (WebElement textlist:Header)
//       	         System.out.println(textlist.getText());//one element is not fetching (brand outlet)
//              List<WebElement> headrlist = driver.findElements(By.xpath( "//li[contains(@class,'gh-t')]"));
//              WebElement li;
//              for(int i=0; i<headrlist.size();i++){
//            	  li = headrlist.get(i);
//            	  System.out.println(li.getText());
//              } 
              /// OR FOR EACH LOOP 
//              for (WebElement hdrlist: headrlist) {
//            	  System.out.println(hdrlist.getText());
//              }
//         WebElement headertext1 =driver.findElement(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/child::li[1]"));
//         System.out.println(headertext1.getText());//hello sign in
//      
//         System.out.println("looping  of following siblings------------------------------------------------------------ ");
//         
//         List< WebElement> followingsiblingHeadertext=  driver.findElements(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/li[1]/following-sibling::*"));
//        		 for (WebElement followingsiblings:followingsiblingHeadertext)
//       		 System.out.println(followingsiblings.getText());//daily deal ,brand outlet, Help& contact-- //one element is not fetching (brand outlet)
//        
//         WebElement Headertext2=  driver.findElement(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/child::li[2]"));
//         System.out.println(Headertext2.getText());//daily deals
//         WebElement Headertext3=  driver.findElement(By.xpath(" //a[contains(text(),'Brand Outlet')]"));
//         	
//         ////*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/li[1]/following-sibling::li[@id='gh-p-4']"));in script (doesnt stop)all worked but not getting text 
//         System.out.println(Headertext3.getText()); //brand outlet
//         WebElement Headertext4=  driver.findElement(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/child::li[4]"));
//                                             //*[@id='mainContent']/ancestor::body/header/div[1]/ul[@id='gh-topl']/li[1]/following-sibling::li[4]"));also worked 
//         System.out.println(Headertext4.getText());// help and contact
//         
//         System.out.println("---------------------looping of second userlist elements in a header with xpath (1) ----------------------------------------------------");
//         
//         List<WebElement> Headertexttable =  driver.findElements(By.xpath( "//*[@id='mainContent']/ancestor::body/header/div[1]/ul[2]")); // 
//         for (WebElement siblingtext:Headertexttable)
//   	     System.out.println(siblingtext.getText());
//         
//         WebElement HeadertextT2 = driver.findElement(By.xpath("//*[@id='mainContent']/ancestor::body/header/child::div[1]/ul[2]/li[contains(@id,'gh-p-2')]"));//sell 
//         
//         System.out.println("looping of second userlist elements in a header with xpath(2) following siblings------  "+ HeadertextT2.getText());
//        
//         List<WebElement> listofsiblings =driver.findElements(By.xpath("//*[@id='mainContent']/ancestor::body/header/div[1]/ul[2]/li[@id='gh-p-2']/following-sibling::*"));
//         for (WebElement SIBLINGs:listofsiblings)
//        	  System.out.println(SIBLINGs.getText());//two elements not fetching
//         System.out.println("---------------------following sibling looping ----------------------------------------------------------");
//
//          List<WebElement> following = driver.findElements(By.cssSelector("#gh-eb"));
//     		//*[@id='mainContent']/ancestor::body/header/child::div[1]/ul[contains(@id,'gh-eb')]"));worked 
//      		//*[@id='mainContent']/ancestor::body/header/child::div[1]/ul[2]/li[contains(@id,'gh-p-2')]"));//sell 
//         
//             for (WebElement siblings : following)
//       	     System.out.println("finding parent css selector by #id "+siblings.getText());
//             System.out.println("example of finding xpath of grand child from parent ");
//         WebElement  desendent=  driver.findElement(By.xpath(("//ul[@id='s0-0-32-4-0-0[5]-4-match-media-0-ebay-carousel-list']/descendant::div[2]")));
//   	     String D= desendent.getText();
//         System.out.println(D);
//         System.out.println("trying to find watchlist element which doesnt show when browser is open and never captures in looping as well  but never interferes with running script ");
//       
//         WebElement watching=  driver.findElement(By.xpath("//ul[@id='gh-eb']/li[2]/div[1]/a[contains(text(),'Watchlist')]"));//it doesnt show when driver opens the browser but never interrupts with running scripts 
//             System.out.println(watching.getSize()); 
              driver.close();
         
	}
	}
}
