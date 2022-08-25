package genericUtility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.service.local.AppiumDriverLocalService;
/**
 * @Author Manigandan Palluru
 */
public class AndroidDriverUtility extends InstanceClass {

		AppiumDriverLocalService service;
		Connection connect;
		ScreenOrientation orientation;
		/**
		 * This method is used to Start the server
		 */
		
		public void startserver() {
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		/**
		 * This method is used to switch the Application between each other
		 * @param appPackage
		 * @param appActivity
		 */
		public void switchApplication(String appPackage,String appActivity) {
			driver.startActivity(appPackage, appActivity);
		}
		
		/**
		 * 
		 * @param source
		 * @param target
		 */
		public void dragAndDrop(WebElement source, WebElement target) {
			TouchAction touch=new TouchAction(driver);
			touch.longPress(source).waitAction().moveTo(target).release().perform();
		}
		
		/**
		 * 
		 * @param source
		 * @param ms
		 * @param target
		 */
		public void dragAndDropwithwaitaction(WebElement source, int ms,WebElement target) {
			TouchAction ta=new TouchAction(driver);
			ta.longPress(source).waitAction(ms).moveTo(target).release().perform();
		}
		/**
		 * This method is used run app in background
		 * @param seconds
		 */
		public void runAppInBackgroud(int seconds) {
			driver.runAppInBackground(seconds);
		}
		
		/**
		 * This method is used to change orientation to Landscape
		 */
		public void orientationLandscapeMode() {
			 driver.getOrientation();
			 driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		
		/**
		 * This method is used to change orientation to portrait
		 */
		public void orientationPortraitMode() {
			 driver.getOrientation();
			 driver.rotate(ScreenOrientation.PORTRAIT);
		}
		
		
		/**
		 * This method is used to perform swipe action
		 * @param startx
		 * @param starty
		 * @param endx
		 * @param endy
		 * @param duration
		 */
		public void swipeAction(int startx, int starty, int endx,int endy,int duration) {
			driver.swipe(startx, starty, endx, endy, duration);
		}
		
		/**
		 * This method is used to perform Scroll action to Till Element
		 * @param driver
		 * @param attributename
		 * @param attributevalue
		 */
		public void scrolltoTillElement(AndroidDriver driver, String attributename, String attributevalue) {
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributename+"(\""+attributevalue+"\"))");
			
		}
		/**
		 * This method is used to use implicit wait
		 * 
		 * @param longTimeout
		 */
		public void implicitwait(AndroidDriver driver,long longTimeout) {
			driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
		}

		
		
		/**
		 * This method is used to perform click action using Tap method
		 * @param fingers
		 * @param element
		 * @param duration
		 */
		public void clickAction(int fingers, WebElement element, int duration) {
			driver.tap(fingers, element, duration);
		}
		
		/**
		 * This method is used to Turn ON/OFF the Data connection
		 */
		public void datastatus() {
			driver.getConnection();
			driver.setConnection(Connection.DATA);
			
		}
		
		/**
		 * This method is used to Turn ON/OFF the Wifi connection
		 */
		public void wifistatus() {
			driver.getConnection();
			driver.setConnection(Connection.WIFI);
			
		}
		/**
		 * This method is used to turn on/off the Airplane mode
		 */
		public void airplanemode() {
			driver.getConnection();
			driver.setConnection(Connection.AIRPLANE);
			
		}
		/**
		 * This method is used to Hide the keyboard after Entering the values
		 */
		public void closeKeyBoard() {
			driver.hideKeyboard();
		}
		public void closeApp()
		{
		driver.closeApp();
		
	}
}

