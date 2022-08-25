package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	public HomePage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='ICC Academy Summer T20 Cup']") 
	private WebElement clickontourName;
	@FindBy(xpath = "//android.widget.TextView[@text='Valley Boyz']") 
	private WebElement clickonteam1Name;
	@FindBy(xpath = "//android.widget.TextView[@text='Dubai Dare Devils']") 
	private WebElement clickonteam2Name;
	@FindBy(xpath = "//android.widget.TextView[@text='VB']") 
	private WebElement clickonflag1Name;
	@FindBy(xpath = "//android.widget.TextView[@text='DDD']") 
	private WebElement clickonflag2Name;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.ImageView[1]") 
	private WebElement clickonbellsymbolbtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Set Reminders']") 
	private WebElement bellsymtext;
	@FindBy(xpath = "//android.widget.TextView[@text='Set Reminders']/preceding-sibling::android.widget.ImageView") 
	private WebElement clickonCrossMark;


	//Business logic

	public String tourname() throws InterruptedException {


		String tourname = clickontourName.getText();
		return tourname;
	}

	public String team1() {

		String team1name = clickonteam1Name.getText();
		return team1name;

	}

	public String team2() {

		String team2name = clickonteam2Name.getText();
		return team2name;
	}

	public String flag1() {

		String flag1name = clickonflag1Name.getText();
		return flag1name;
	}
	public String flag2() {

		String flag2name = clickonflag2Name.getText();
		return flag2name;
	}
	public void bellSymbol() {
		clickonbellsymbolbtn.click();
	}
	public String message() {
		String bellsymbol = bellsymtext.getText();
		return bellsymbol;
	}

	public void closeRemainder() {
		clickonCrossMark.click();
	}

}
