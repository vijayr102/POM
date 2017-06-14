package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_DuplicateLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC008";
		testCaseName = "DuplicateLead";
		testDescription = "Duplicate a Lead in LeafTaps";
		category = "smoke";
		authors = "Gopi";		
	}
	
	@Test(dataProvider = "fetchData")
	public void duplicateLead(String uName, String pwd,String email){
		String a=new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSFa()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmail(email)			
		.clickFindLeads()
		.getName();
		 new FindLead(driver,test)
		.clickFirstLink()
		.clickDuplicateLead()
		.clickCreateLead()		
		.verifyFirstName(a);		
	}		
}










