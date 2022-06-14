package testPackage;

    

      import org.openqa.selenium.By;
      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.WebElement;
      import org.openqa.selenium.chrome.ChromeDriver;
      import org.openqa.selenium.support.ui.Select;

    public class AssignmentLocate10ElementandVerify {
    	
    	
    	

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS//chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.com/");
       // System.out.println("Start page title : "+ driver.getTitle());
        //driver.manage().window().maximize();
          
         
          
//          // 1. finding element in a search field and storing it in as a WebElement  and  then creating string as a variable and assigned a value 
//          //    and then sending  that String reference name as keys of that searchbox WebElement 
//          
          String searchword="tablets";
          searchword="computers";
          WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
          searchbox.sendKeys(searchword);
          
          // 2.finding  button element  and click action is performed on it 
          WebElement Button = driver.findElement(By.id("nav-search-submit-button"));
          Button.click();
          Thread.sleep(1000);
          
          //// verification point
          String pageURL =  driver.getCurrentUrl();
          System.out.println(searchword + " pageURL "+ pageURL);
          
            String pagetitle= driver.getTitle();      //
          System.out.println(searchword + " correctpagetitle " + pagetitle);
          String expectedpagetitle= "Amazon.com : computers";
          System.out.println(expectedpagetitle + " expectedpagetitle :"+ searchword);
          
         
          if (pagetitle.equals(expectedpagetitle)) {
        	 System.out.println("Search box functionality "+ searchword +" Test passed ");}
          else 
        	 {System.out.println("Search box functionality "+ searchword +" Test Failed ");                 
              }
          
          //3.  finding  one of the menu link in a homepage  by link test strategy and verifying it 
          
          String link ="Amazon Home" ;      //IMportant--->  link cannot find if there is even little  space  left between commas 
          WebElement menuLink = driver.findElement(By.linkText(link));
          Thread.sleep(1000);
          menuLink.click();
          
          //verification point 
          String titlepageofamazonhome =  driver.getTitle();
          System.out.println( link + " title of the page :" + titlepageofamazonhome );
          String expectedpagetitleofamazonhome= "Shop Amazon Home Products";
          System.out.println("Expected page title of amazon Home Link : "+expectedpagetitleofamazonhome);
          
          if (titlepageofamazonhome.equals(expectedpagetitleofamazonhome)) {
         	 System.out.println(" Menu Link functionality " + link + " Test passed ");
         	 }
          else 
         	 {System.out.println(" Menu Link functionality " + link + " Test Failed ");                 
               }
          
////          // 4. findind main menu link (PRIME) with  customized xpath
//          
//          WebElement menuLink7 = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]/preceding-sibling::a[1]")); // using parent xpath and child index and then  finding siblings
//          menuLink7.click();
//         // verification point
//          String pagetitlemenulink7= driver.getCurrentUrl();
//          System.out.println("current URL of PRIME menu Link functionality : "+pagetitlemenulink7);
//          
//          
//
//          
////          // 5. finding  another menu webElement(BOOKS)  by following sibling  customized xpath method 
//           WebElement menuLink8 = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]/following-sibling::a[1]"));
//           menuLink8.click();
//           // verification point 
//           String currntitleoflinkbooks = driver.getTitle();
//           System.out.println("( Curent title )of menu link (BOOKS) functionality :"+currntitleoflinkbooks);
//           String Exptdtitleoflinkbooks= ("Amazon.com: Books");
//           System.out.println("( Expected title ) of (Books) link menu : "+Exptdtitleoflinkbooks+ +currntitleoflinkbooks.compareTo(Exptdtitleoflinkbooks));
//          if (currntitleoflinkbooks.equals(Exptdtitleoflinkbooks)) {
//          	 System.out.println(" Menu Link BOOKS functionality " + currntitleoflinkbooks + " Test passed ");
//          	 }
//           else 
//          	 {System.out.println(" Menu Link  BOOKS functionality " + currntitleoflinkbooks + " Test Failed ");                 
//                }
//       
          
      // 6. Finding static drop down button element and select one element with the help of SELECT class 
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select selectoptions =new Select(dropdown);
        dropdown.click();
        System.out.println(driver.getCurrentUrl());
        selectoptions.selectByValue("search-alias=computers");
        Thread.sleep(1000);
        dropdown.click();
        Thread.sleep(1000);
        String  cURL =driver.getCurrentUrl();
        System.out.println(cURL);
        String expURL="https://www.amazon.com/";
        System.out.println(expURL);
        if (cURL.equals(expURL)) {
     	 System.out.println(" Drop down  COMPUTERS link functionality " + cURL + " Test passed ");
     	 }
         else 
    	 {System.out.println("Drop down  COMPUTERS functionality " + cURL + " Test Failed ");                 
           }
        
        
        
        // 7.findind another element (by customized Xpath )button that contains drop down object but does not contain select and are link 
        WebElement drpdwn= driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
        Thread.sleep(1000);
        drpdwn.click();
        System.out.println(driver.getTitle());
        
        //8.finding  link element by customized xpath  in a drop down button and verifying it 
        WebElement amzmuzic= driver.findElement(By.xpath("//div[@id='hmenu-content']/ul[1]/li[8]/a/div"));
        amzmuzic.click();
        System.out.println(driver.getTitle());
//        String currturl =
//        String expurl=(" https://www.amazon.com/");
//        System.out.println(amzmuzic+"AmazonMusic link functionality : "+currturl.equals(expurl));
//        if (currturl.equals(expurl)) {
//        	 System.out.println(" AmazonMusic link functionality " + currturl + " Test passed ");
//        	 }
//        else 
//       	 {System.out.println("AmazonMusic link functionality " + currturl + " Test Failed ");                 
//              }
        
        //9.finding  back arrow element by customized xpath and click it to return to previous drop down page 
        WebElement backarrow = driver.findElement(By.xpath("//div[@id='hmenu-content']/ul[3]/li[1]/a/div/i"));
        Thread.sleep(1000);
        backarrow.click();
        
         //10. finding webelement xout with customized x-path   and then by clicking on it closes that drop down window 
         WebElement xout= driver.findElement(By.xpath("//div[@id='hmenu-canvas-background']/div"));
         Thread.sleep(1000);
         xout.click();
         System.out.println(driver.getCurrentUrl());
         driver.getTitle();
         Thread.sleep(1000);
          
          //find back arrow in a page and clicked on it 
//          WebElement Arrow =driver.findElement(By.cssSelector("#gw-desktop-herotator > div > div > div > div.a-carousel-col.a-carousel-left.celwidget > a > i"));
//          Thread.sleep(1000);
//          Arrow.click();
//          Thread.sleep(1000);
//       //  NEED TO CLARIFY VERY DYNAMIC KEEP CHANGING     
//       //finding element in menu link (NOT REGISTRY FOUND IN HOME PAGE 
//       //AFTER CLICKING PRIME IT TOOK US TO ANOTHER PAGE AND SECOND LINK WILL TURN INTO MUSIC  ON THAT PAGE SO A[2] WILL BECOME MUSIC LINK ) using xpath of  one sibling 
//       WebElement menuLink9 = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]/following-sibling::a[2]")); // MUSIC LINK 
//       Thread.sleep(1000);
//       menuLink9.click();
//       // verification point
//       String currntitleoflinkMUSIC = driver.getTitle();
//       System.out.println("Curent title of menu link MUSIC functionality :"+currntitleoflinkMUSIC);
//       String ExptdtitleoflinkMUSIC= "Amazon Registry & Gifting";
//       System.out.println(ExptdtitleoflinkMUSIC +"Expected title of Music link menu : "+ currntitleoflinkMUSIC.compareToIgnoreCase(ExptdtitleoflinkMUSIC));
//      if (currntitleoflinkMUSIC.equals(ExptdtitleoflinkMUSIC)) {
//      	 System.out.println(" Menu Link MUSIC functionality " + currntitleoflinkMUSIC + " Test passed ");
//      	 }
//       else          	
//       {System.out.println(" Menu Link  MUSIC functionality " + currntitleoflinkMUSIC + " Test Failed ");                 
//           }
          
          driver.close();
	}

}
