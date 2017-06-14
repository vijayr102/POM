package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DeleteLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC007";
		testCaseName = "DeleteLead";
		testDescription = "Delete a Lead in LeafTaps";
		category = "smoke";
		authors = "Gopi";		
	}
	
	@Test(dataProvider = "fetchData")
	public void DeleteLead(String uName, String pwd,String phoneNumber){
		String a=new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSFa()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeads() 
		.getLeadID();		
		
		new FindLead(driver,test)
		.clickFirstLink()
		.clickDeleteLead()
		.clickFindLeads()
		.enterLeadID(a)
		.clickFindLeads()
		.verifyNoRecords();			
	}		
}










