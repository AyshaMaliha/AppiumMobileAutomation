package nativeAppAutomation;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Calculator {
	public static void main(String[] args) throws Exception {
		//System.out.print();
		//ClassNAme object=new ClassName();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Halaqu Khan");
		dc.setCapability("udId","JYNBB18509152412");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","8.0.0");
		//dc.setCapability("deviceName","");
		
		dc.setCapability("appPackage","com.google.android.calculator");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		
		//dc.setCapability("appPackage","com.pointofsale.nexchar");
		//dc.setCapability("appActivity","com.pointofsale.nexchar.MainActivity");
		
		URL server= new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver MobileObj=new AppiumDriver(server,dc);
		
		//verify
		
		System.out.println("App opening");
		
		
		// target 2+6=8 & more option click
		
		//digit 2 object create
		WebElement digit2=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_2")); 
		//digit 6 object create
		WebElement digit6=MobileObj.findElement(By.id("com.google.android.calculator:id/digit_6"));
		//equalBtn object create
		WebElement eqBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/eq"));
		// AddBtn object create
		WebElement addBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/op_add"));
		
		//Result
		//WebElement resultBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/result_final"));
		//more option Button objective create
		WebElement moreOpt=MobileObj.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
		
		//History
		//WebElement historyOpt=MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
	
		
		//WebElement historyOpt=MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));

		//Action place
		
		digit2.click();
		addBtn.click();
		digit6.click();
		eqBtn.click();
		Thread.sleep(3000);
		//Result
		WebElement resultBtn=MobileObj.findElement(By.id("com.google.android.calculator:id/result_final"));
		System.out.println("The Result is: " +resultBtn.getText());
		
		Thread.sleep(3000);
		moreOpt.click();
		
		Thread.sleep(3000);
		//
		WebElement historyOpt=MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		historyOpt.click();
	
		
		
	}

}
