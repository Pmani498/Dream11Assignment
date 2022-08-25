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
		String expectedMatchname = excelUtility.getDataFromExcel("NavigationBar", 1, 1);
		String actualMatchname = navigationbar.myMatches();
		System.out.println(actualMatchname);
		Assert.assertEquals(actualMatchname, expectedMatchname, "Not validated");

		String expectedWinnersname = excelUtility.getDataFromExcel("NavigationBar", 2, 1);
		String actualWinnersname = navigationbar.winnersbtn();
		System.out.println(actualWinnersname);
		Assert.assertEquals(actualWinnersname, expectedWinnersname, "Not validated");

		String expectedChatTitle = excelUtility.getDataFromExcel("NavigationBar", 3, 1);
		String actualchatTitle = navigationbar.chatbtn();
		System.out.println(actualchatTitle);
		Assert.assertEquals(actualchatTitle, expectedChatTitle, "Not validated");

		String expectedRewardname = excelUtility.getDataFromExcel("NavigationBar", 4, 1);
		String actualRewardname = navigationbar.rewardbtn();
		System.out.println(actualRewardname);
		Assert.assertEquals(actualRewardname, expectedRewardname, "Not validated");

	}

}
