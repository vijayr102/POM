package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_EditLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC006";
		testCaseName = "EditLead";
		testDescription = "Edit a Lead in LeafTaps";
		category = "smoke";
		authors = "Gopi";		
	}
	
	@Test(dataProvider = "fetchData")
	public void editLead(String uName, String pwd,String firstName,String companyName){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSFa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(firstName)		
		.clickFindLeads()
		.clickFirstLink()
		.clickEditLead()
		.enterCompanyName(companyName)
		.clickUpdateLeads()
		.verifyCompanyName(companyName);			
	}		
}










