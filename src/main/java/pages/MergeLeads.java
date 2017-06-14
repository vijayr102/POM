package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;


public class MergeLeads extends LeafTapsWrappers{

	public MergeLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This in not My Leads Page", "FAIL");
		}		
	}	
	public FindLeadWin clickFromLeads(){
		clickByXpathNoSnap("(//img[@alt='Lookup'])");
		switchToLastWindow();
		return new FindLeadWin(driver,test);
	}
	public FindLeadWin clickToLeads(){
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");	
		switchToLastWindow();
		return new FindLeadWin(driver,test);
	}
	public ViewLead clickMergeLeads(){
		clickByLink("Merge");	
		acceptAlert();
		return new ViewLead(driver,test);
	}

}



























