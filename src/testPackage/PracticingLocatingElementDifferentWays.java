package testPackage;

//   import java.util.Iterator;
//   import java.util.List;
//   import java.util.Set;
//
//   import org.openqa.selenium.By;
//   import org.openqa.selenium.WebDriver;
//   import org.openqa.selenium.WebElement;
//  
//   import org.openqa.selenium.chrome.ChromeDriver;
//   import org.openqa.selenium.support.ui.Select;
////   import org.openqa.selenium.interactions.Actions;
//
//
//
      public class PracticingLocatingElementDifferentWays {

	public static void main(String[] args) throws InterruptedException {
//	
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arinder\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com");
//		driver.manage().window().maximize();
//		System.out.println("Title of home page: "+driver.getTitle());
//		System.out.println("Test case of finding all images and links in a homepage");
//        
//        
//
//        System.out.println("");
//
//        
//// All images in a page      
//        List<WebElement> AllImagesInaPage=driver.findElements(By.tagName("img"));
//        System.out.println("Number of images :" +AllImagesInaPage.size());
//        System.out.println("-------------------------------------------------");
//        for(WebElement img: AllImagesInaPage) {
//        	System.out.println(img.getAttribute("src"));
//        }
//        
//       
//   // All links in a page      
//        List<WebElement>   AllLinksInAPage =driver.findElements(By.tagName("a"));
//        System.out.println("Number of links in a page :"  +AllLinksInAPage.size());
//        for (WebElement link: AllLinksInAPage) {
//            System.out.println(link.getAttribute("herf") );
//        }
//      
//  //handling radio button 
//    //   driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']")).click();                  //// xpath worked 
//         driver.findElement(By.xpath( "//a[@aria-label='Choose a language for shopping.']")).click();             // //another xpath  also worked 
//         Thread.sleep(1500);
//         WebElement Radiobutton1 = driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i"));
//         Radiobutton1.click();
//         System.out.println("Radiobutton is clicked :"  +Radiobutton1.isEnabled());
//         Thread.sleep(3000);
//         WebElement Radiobutton2= driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i"));
//         Radiobutton2.click();
//         System.out.println("Radiobutton is clicked :"  +Radiobutton2.isEnabled());
//         Thread.sleep(3000);
//         driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
//         System.out.println("Radiobutton is clicked :"  +Radiobutton1.isEnabled());
//         Thread.sleep(3000);
//         WebElement SubmitButton1 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
//         SubmitButton1.click();
//         Thread.sleep(3000);
//                                        //         for( String Radiobutton: Radiobuttons){
//                                        //                                              System.out.println(Radiobutton.length());
//
//                                        
//                                        
//  //handling drop down 
//      WebElement allDropDown =driver.findElement(By.id("searchDropdownBox"));
//      Select dropdownbox= new Select(allDropDown);
//      allDropDown.click();
//      Thread.sleep(3000);
//      dropdownbox.selectByIndex(2);
//      Thread.sleep(3000);
//      dropdownbox.selectByVisibleText("Appliances");
//      Thread.sleep(3000);
//      dropdownbox.selectByValue("search-alias=arts-crafts");
//      Thread.sleep(3000);
////        Actions action = new Actions(driver);
////        WebElement allDropDown = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
////        action.moveToElement(allDropDown).click().build().perform();
//        
//  //handling check box 
//      driver.navigate().to("https://www.bankofamerica.com/");
//      WebElement Checkbox = driver.findElement(By.xpath("//input[@id='saveOnlineId']"));
//      Checkbox.click();
//      Thread.sleep(3000);
//      driver.findElement(By.xpath("//input[@id='saveOnlineId']")).click();
//      Thread.sleep(2500);
//      
// //handling pop up message
//      driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
//      driver.findElement(By.name("cusid")).sendKeys("avi");
//      Thread.sleep(3000);
//      driver.findElement(By.name("submit")).click();
//                                                                                        
//      
//      String firstAlertmessage= driver.switchTo().alert().getText();
//      System.out.println("first alert message: "+firstAlertmessage);
//      driver.switchTo().alert().accept();
//      Thread.sleep(3000);
//      String secondAlertmessage= driver.switchTo().alert().getText();
//      System.out.println("Second alert message: "+secondAlertmessage);
//      driver.switchTo().alert().accept();
//      Thread.sleep(3000);
//      driver.findElement(By.name("cusid")).sendKeys("avi");
//      driver.findElement(By.name("submit")).click();
//      Thread.sleep(3000);
//      driver.switchTo().alert().dismiss();
//      Thread.sleep(3000);
//        
// 
//        
// // handling window 
//      driver.navigate().to("http://the-internet.herokuapp.com/windows");
//      System.out.println("Page title: "+driver.getTitle());
//      System.out.println("window handle of the start  page :"+driver.getWindowHandle());
//      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//      
// //   driver.findElement(By.xpath("//a[@target='_blank'][ @xpath='1']")).click();   //(found  matching element in chropath but not worked in script.)
//      driver.findElement(By.linkText("Click Here")).click();                          // (link worked) 
//      
//      Set<String>handles=driver.getWindowHandles();
//      System.out.println("Number of window opened : " +handles.size());
//      Thread.sleep(3000);
//      
// //  driver is switching  to new  window to get the handle of new windows .
//      for (String handle :handles){
//      System.out.println(handle);
//       driver.switchTo().window(handle);
//       }
//      
// // in order to grab the handle of n number of opened windows regardless  getting title  and switching back and forth .
//      
//      Iterator<String> itratr=handles.iterator();
//      String parentWindowahandle=itratr.next();
//      String ChildWindowHandle=itratr.next();
//      System.out.println("Parent window Handle : "+parentWindowahandle);
//      System.out.println("Child window Handle : "+ ChildWindowHandle);
//      
//// switching  windows back and forth and having the titles printed for the verification purpose 
//      driver.switchTo().window(ChildWindowHandle);             
//      System.out.println("Child window title : "+driver.getTitle());
//      Thread.sleep(3000);
//      driver.close();
//      driver.switchTo().window(parentWindowahandle);
//      Thread.sleep(3000);
//      driver.close();
//      
//      while (itratr.hasNext()){
//    	   driver.switchTo().window(itratr.next());
//           System.out.println( "window title :"+driver.getTitle());
//           System.out.println(driver.getCurrentUrl());
//           driver.close();
//           
//           
          }
       }

       
