package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;


public class MyLeads extends LeafTapsWrappers{

	public MyLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This in not My Leads Page", "FAIL");
		}		
	}	
	public CreateLead clickCreateLeads(){
		clickByLink("Create Lead");	
		return new CreateLead(driver,test);
	}
	public FindLead clickFindLeads(){
		clickByLink("Find Leads");	
		return new FindLead(driver,test);
	}
	public MergeLeads clickMergeLeads(){
		clickByLink("Merge Leads");	
		return new MergeLeads(driver,test);
	}

}



























