package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLead extends LeafTapsWrappers{

	public EditLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This in not Edit Lead Page", "FAIL");
		}		
	}

	public EditLead enterCompanyName(String data){
		enterById("updateLeadForm_companyName", data);
		return this;
	}
	
	public ViewLead clickUpdateLeads(){
		clickByClassName("smallSubmit");
		return new ViewLead(driver, test);
	}
}

















