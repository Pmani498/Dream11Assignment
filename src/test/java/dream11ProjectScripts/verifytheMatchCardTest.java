package dream11ProjectScripts;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import objectRepository.HomePage;
public class verifytheMatchCardTest extends BaseClass {
	@Test
	public  void verifytheMatchcard() throws MalformedURLException, InterruptedException {
				
		      HomePage homePage=new HomePage(driver);
		
		String expectedTourname = excelUtility.getDataFromExcel("MatchCard",1, 1);
		String actualTourname = homePage.tourname();
		javaUtility.printStatement(actualTourname);
		Assert.assertEquals(actualTourname, expectedTourname, "Not validated");
		
		String expectedTeam1Name = excelUtility.getDataFromExcel("MatchCard",2, 1);
		String actualTeam1Name = homePage.team1();
		javaUtility.printStatement(actualTeam1Name);
		Assert.assertEquals(actualTeam1Name, expectedTeam1Name, "Not validated");
		
		String expectedTeam2Name = excelUtility.getDataFromExcel("MatchCard",3, 1);
		String actualTeam2Name = homePage.team2();
		javaUtility.printStatement(actualTeam2Name);
		Assert.assertEquals(actualTeam2Name, expectedTeam2Name, "Not validated");
		
		String expectedFlag1Name= excelUtility.getDataFromExcel("MatchCard",4, 1);
		String actualFlag1Name = homePage.flag1();
		javaUtility.printStatement(actualFlag1Name);
		Assert.assertEquals(actualFlag1Name, expectedFlag1Name, "Not validated");
		
		String expectedFlag2Name = excelUtility.getDataFromExcel("MatchCard",5, 1);
		String actualFlag2Name = homePage.flag2();
		javaUtility.printStatement(actualFlag2Name);
		Assert.assertEquals(actualFlag2Name, expectedFlag2Name, "Not validated");
		
		homePage.bellSymbol();
		
		String expectedRemaindermessage = excelUtility.getDataFromExcel("MatchCard",6, 1);
		String actualRemaindermessage = homePage.message();
		javaUtility.printStatement(actualRemaindermessage);
		Assert.assertEquals(actualRemaindermessage, expectedRemaindermessage, "Not validated");
		
		homePage.closeRemainder();
		
			

}

}
