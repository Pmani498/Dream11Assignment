package dream11ProjectScripts;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import objectRepository.NavigationbarPage;

public class VerifytheNavigationbaronHomescreenTest extends BaseClass {
	@Test
	public void navigationTool() throws MalformedURLException, InterruptedException {
		
		NavigationbarPage navigationbar = new NavigationbarPage(driver);
		String expectedMatchname = excelUtility.getDataFromExcel("NavigationBar", 1, 2);
		String actualMatchname = navigationbar.myMatches();
		javaUtility.printStatement(actualMatchname);
		Assert.assertEquals(actualMatchname, expectedMatchname, "Not validated");

		String expectedWinnersname = excelUtility.getDataFromExcel("NavigationBar", 2, 2);
		String actualWinnersname = navigationbar.winnersbtn();
		javaUtility.printStatement(actualWinnersname);
		Assert.assertEquals(actualWinnersname, expectedWinnersname, "Not validated");

		String expectedChatTitle = excelUtility.getDataFromExcel("NavigationBar", 3, 2);
		String actualchatTitle = navigationbar.chatbtn();
		javaUtility.printStatement(actualchatTitle);
		Assert.assertEquals(actualchatTitle, expectedChatTitle, "Not validated");

		String expectedRewardname = excelUtility.getDataFromExcel("NavigationBar", 4, 2);
		String actualRewardname = navigationbar.rewardbtn();
		javaUtility.printStatement(actualRewardname);
		Assert.assertEquals(actualRewardname, expectedRewardname, "Not validated");

	}

}
