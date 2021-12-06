package nativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Nexchar {
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","Halaqu Khan");
		dc.setCapability("udId","JYNBB18509152412");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","8.0.0");
		//dc.setCapability("unicodeKeyboard", true);
		//dc.setCapability(“resetKeyboard”, true);
		
		dc.setCapability("appPackage","com.pointofsale.nexchar");
		dc.setCapability("appActivity","com.pointofsale.nexchar.MainActivity");
		
		//dc.setCapability("strategy", "swipeDown");
		
        URL server= new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver MobileObj=new AppiumDriver(server,dc);
		
		
		System.out.println("App opening");
		
		//UserName
		 MobileObj.findElement(By.id("com.pointofsale.nexchar:id/user_name")).sendKeys("gift_shop");
		//Password
		// MobileObj.findElement(By.id("com.pointofsale.nexchar:id/password")).sendKeys("12345");
		 WebElement pass=MobileObj.findElement(By.id("com.pointofsale.nexchar:id/password"));
		 pass.sendKeys("12345");
		 
		 
		 //swipe down key board
		 MobileObj.navigate().back();
		 //AppiumDriver.getKeyboard();
		// MobileObj.findElement(By.id("com.pointofsale.nexchar:id/password")).tapOut();
		
		 //SignIn
		 MobileObj.findElement(By.id("com.pointofsale.nexchar:id/email_sign_in_button")).click();
	}

}
