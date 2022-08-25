package genericUtility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * @author Manigandan Palluru
 */
public class BaseClass extends InstanceClass{
	

	@BeforeClass
	public void serverstart()
	{
		androiddriverUtility=new AndroidDriverUtility();
		excelUtility = new ExcelUtility();
		javaUtility = new JavaUtility();
		fileUtility = new FileUtility();
		fileUtility.initializethePropertyFile(IPathConstants.MOBILEPROPERTIYFILE);
		excelUtility.initializeExcelFile(IPathConstants.MOBILEEXCELFILE);
		//String visibletext=excelutility.getDataFromExcel("Search", 5,1);
		platformName=fileUtility.getcommonDatafromProperty("PlatformName");
		platformVersion=fileUtility.getcommonDatafromProperty("PlatformVersion");
		deviceId=fileUtility.getcommonDatafromProperty("UDIDDevicId");
		appPackage=fileUtility.getcommonDatafromProperty("appPackage");
		appActivity=fileUtility.getcommonDatafromProperty("appActivity");
		localurl=fileUtility.getcommonDatafromProperty("URL");
		timeout=fileUtility.getcommonDatafromProperty("timeouts");
		longtimeout = javaUtility.convertStringToLong(timeout);
		
	}
	@BeforeMethod
	public void openApp() throws MalformedURLException {
		desiredcapbilities = new DesiredCapabilities();
		desiredcapbilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		desiredcapbilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		desiredcapbilities.setCapability(MobileCapabilityType.UDID, deviceId);
		desiredcapbilities.setCapability("appPackage", appPackage);
		desiredcapbilities.setCapability("appActivity", appActivity);
		desiredcapbilities.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL(localurl);
		driver = new AndroidDriver(url,desiredcapbilities);
		androiddriverUtility.implicitwait(driver, longtimeout);
		
	}

	@AfterMethod()
	public void closeApp() {
		driver.closeApp();
	}

	@AfterClass
	public void closeserver() {
		
	}
}

