package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.InstanceClass;
import io.appium.java_client.android.AndroidDriver;


public class NavigationbarPage extends InstanceClass{
	public NavigationbarPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Matches\"]/android.view.ViewGroup/android.widget.TextView") 
	private WebElement myMatchIcon;
	@FindBy(xpath = "//android.widget.TextView[@index='2']") 
	private WebElement getMatchText;
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Winners\"]/android.widget.FrameLayout/android.widget.ImageView") 
	private WebElement winnersIcon;
	@FindBy(xpath = "//android.widget.TextView[@text='Winners']") 
	private WebElement getwinnersText;
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Chat\"]/android.widget.FrameLayout/android.widget.ImageView") 
	private WebElement getChatimg;
	@FindBy(xpath = "//android.widget.TextView[@text='Chat']") 
	private WebElement getchattext;
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Rewards\"]/android.widget.FrameLayout/android.widget.ImageView") 
	private WebElement rewardsimg;
	@FindBy(xpath = "//android.widget.TextView[@text='Reward Shop']") 
	private WebElement rewardsShoptext;
	
	
	//Business logic
	
	public String myMatches() throws InterruptedException {
		
		myMatchIcon.click();
		String myMatch = getMatchText.getText();
		return myMatch;
	}
	
	public String winnersbtn() {
		winnersIcon.click();
		String winners = getwinnersText.getText();
		return winners;
		
	}
	
	public String chatbtn() {
		getChatimg.click();
		String chat = getchattext.getText();
		return chat;
	}

	public String rewardbtn() {
		rewardsimg.click();
		String reward = rewardsShoptext.getText();
		return reward;
	}

}

