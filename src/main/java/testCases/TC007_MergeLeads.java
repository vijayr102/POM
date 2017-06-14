package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadWin;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_MergeLeads extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC009";
		testCaseName = "MergeLead";
		testDescription = "Merge a Lead in LeafTaps";
		category = "smoke";
		authors = "Gopi";		
	}
	
	@Test(dataProvider = "fetchData")
	public void MergeLead(String uName, String pwd,String fName,String sName){
		String a=new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSFa()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeads()
		.enterFirstName(fName)			
		.clickFindLeads()
		.getLeadID();
		
		new FindLeadWin(driver,test)
		.clickFirstLink()
		.clickToLeads()
		.enterFirstName(sName)			
		.clickFindLeads()
		.clickFirstLink()
		.clickMergeLeads()
		.clickFindLeads()
		.enterLeadID(a)
		.clickFindLeads()
		.verifyNoRecords();		
	}		
}










