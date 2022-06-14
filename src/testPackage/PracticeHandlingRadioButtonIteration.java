package testPackage;

 // import java.util.List;

    import org.openqa.selenium.By;

  

//
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
//    import org.openqa.selenium.interactions.Actions;

    public class PracticeHandlingRadioButtonIteration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Arinder\\OneDrive\\Desktop\\New folder (2)\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com");
	
	    //System.out.println("Title of home page: "+driver.getTitle());
     //   driver.manage().window().maximize();
 //         driver.findElement(By.xpath( "//a[@aria-label='Choose a language for shopping.']")).click();
//         
//             
//        WebElement Radiobutton1 = driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i"));
//        Radiobutton1.click();
//        System.out.println("Radiobutton is clicked :"  +Radiobutton1.isEnabled());
//        Thread.sleep(3000);
//        WebElement Radiobutton2= driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i"));
//        Radiobutton2.click();
//        System.out.println("Radiobutton is clicked :"  +Radiobutton2.isEnabled());
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
//        System.out.println("Radiobutton is clicked :"  +Radiobutton1.isEnabled());
//        Thread.sleep(3000);
//        WebElement SubmitButton1 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
//        SubmitButton1.click();
//        Thread.sleep(3000);
        
 // validation that radio buttons are unselected  and no action was performed after clicking radio buttons interchanchably  
//        List <WebElement> AllRadioButtons9 =   driver.findElements(By.xpath("//div[@data-a-input-name='LOP']")); //only two elements present of 
                                                                                                     //this name that represents the 2 radio button  
    
//            for(WebElement RadioButton : AllRadioButtons9) {
//             String SelectedButtonStatus = "(Unselected)";
//             boolean IsButtonSelected = RadioButton.isSelected();
//                 if(IsButtonSelected) {
//                   SelectedButtonStatus = "(Selected)";
//                      }
//                    System.out.println("The radio button \"" + RadioButton.getAttribute("data-a-input-name") + "\" " + SelectedButtonStatus);
//                       }
            
         // handling drag and drop 
            
            driver.navigate().to("https://jqueryui.com/droppable/");
            WebElement iframe = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
            driver.switchTo().frame(iframe);
            
            Actions action = new Actions(driver);
           
           WebElement dragableObj = driver.findElement(By.id("draggable"));
           WebElement dropableObj = driver.findElement(By.id("droppable"));
            
           action.doubleClick().clickAndHold(dragableObj).moveToElement(dropableObj).release().build().perform();

    //       action.moveToElement(dragableObj).clickAndHold().moveToElement(dropableObj).release().build().perform();
     
    //          action.dragAndDrop(dragableObj, dropableObj).build().perform();
              
	}            
        
          
}
