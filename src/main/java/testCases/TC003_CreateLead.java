package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC002";
		testCaseName = "CreateLead";
		testDescription = "Create a Lead in LeafTaps";
		category = "smoke";
		authors = "Gopi";		
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd,String firstName,String lastName,String companyName){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSFa()
		.clickLeads()
		.clickCreateLeads()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(companyName)
		.clickCreateLeads()
		.verifyFirstName(firstName);		
	}
	
	
}










