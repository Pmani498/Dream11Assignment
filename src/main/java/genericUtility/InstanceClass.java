package genericUtility;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
/**
 * 
 * @author Manigandan Palluru
 *
 */
public class InstanceClass {
	public ExcelUtility excelUtility;
	public JavaUtility javaUtility; 
	public FileUtility fileUtility;
	public AndroidDriverUtility androiddriverUtility;
	protected String username; 
	protected String password; 
	public DesiredCapabilities desiredcapbilities;
	public AndroidDriver driver;
	protected String platformName;
	protected String platformVersion;
	protected String emulatorVersion;
	protected String deviceId;
	protected String emulatorname;
	protected String appPackage;
	protected String appActivity;
	public String localurl;
	protected long longtimeout;
	public String timeout;
	
	
}
