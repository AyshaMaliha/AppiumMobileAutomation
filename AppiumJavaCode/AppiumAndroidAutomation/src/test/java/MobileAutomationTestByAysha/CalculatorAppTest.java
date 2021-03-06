package MobileAutomationTestByAysha;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorAppTest {
	
	public static void main(String[] args) throws Exception {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Halaqu Khan");
		dc.setCapability("udId","JYNBB18509152412");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","8.0.0");
		dc.setCapability("appPackage","com.google.android.calculator");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		
        URL server= new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver MobileObj=new AppiumDriver(server,dc);
		
		System.out.println("Hola!");
		
		//My phone number 01992012220
		//[ (Mobile Phone Number 7th digit + Mobile Phone Number 6th digit) - {Mobile Phone Number 8th digit * Mobile Phone Number 9th digit} ] / 2
		//for starting bracket
		WebElement bracket1=MobileObj.findElement(By.id("com.google.android.calculator:id/parens"));
		WebElement bracket2=MobileObj.findElement(By.id("com.google.android.calculator:id/parens"));
		
		//Digit 1
		WebElement digit1=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_1"));
		
		//Add
		WebElement addBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/op_add"));
		
		//Digit 0
		WebElement digit0=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_0"));
		
		//Closing Bracket
		WebElement bracket3=MobileObj.findElement(By.id("com.google.android.calculator:id/parens"));
		
		//Sub
		WebElement subBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/op_sub"));
		
		//Opening bracket
		WebElement bracket4=MobileObj.findElement(By.id("com.google.android.calculator:id/parens"));
		
		//Digit 2
		WebElement digit2=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_2")); 
		
		//Multiply
		WebElement mulBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/op_mul"));
		
		//Digit 2
	    WebElement digit02=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_2")); 
	    
	   //Closing Bracket
	  	WebElement bracket5=MobileObj.findElement(By.id("com.google.android.calculator:id/parens")); 
	  	WebElement bracket6=MobileObj.findElement(By.id("com.google.android.calculator:id/parens")); 
	  	
	  	//Divide
	  	WebElement divBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/op_div"));
	  	
	  //Digit 2
	   WebElement digit002=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_2"));
		
	  //equalBtn object create
	  WebElement eqBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/eq"));
	
	  //more option
	  WebElement moreOpt=MobileObj.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
	  
	 // Thread.sleep(3000); 
	  //Capture equation
	  WebElement capEquation=MobileObj.findElement(By.id("com.google.android.calculator:id/formula")); 
	  //System.out.println("The equation is: " +capEquation.getText());
	  
		//Action
	  bracket1.click();
	  bracket2.click();
	  digit1.click();
	  addBtn.click();
	  digit0.click();
	  bracket3.click();
	  subBtn.click();
	  bracket4.click();
	  digit2.click();
	  mulBtn.click();
	  digit02.click();
	  bracket5.click();
	  bracket6.click();
	  divBtn.click();
	  digit002.click();
	
	  
	  Thread.sleep(3000);
	  System.out.println("The equation is: " +capEquation.getText());
	  
	  eqBtn.click();
	  
	  Thread.sleep(3000); 
	  
		//Result
		WebElement resultBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/result_final"));
		System.out.println("The solution of the equation is: " +resultBtn.getText());
		
		Thread.sleep(3000);
		moreOpt.click();
		
		Thread.sleep(3000);
		//History
		WebElement historyOpt=MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		historyOpt.click();
	
	}
	

}
