package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


import wrappers.LeafTapsWrappers;


public class ViewLead extends LeafTapsWrappers{
	public ViewLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This in not ViewLead Page", "FAIL");
		}		
	}	
	public ViewLead verifyFirstName(String data){
		verifyTextById("viewLead_firstName_sp", data);	
		return this;
	}
	public ViewLead verifyCompanyName(String data){
		String companyName = getTextById("viewLead_companyName_sp");
		companyName = companyName.substring(0,companyName.indexOf('(')-1);	
		if(companyName.equals(data))		
			reportStep("The text: "+companyName+" matches with the value :"+data, "PASS");
		else
			reportStep("The text: "+companyName+" did not match with the value :"+data, "FAIL");
			return this;		
	}
	public EditLead clickEditLead(){
		clickByLink("Edit");
		return new EditLead(driver,test);
	}
	public DuplicateLead clickDuplicateLead(){
		clickByLink("Duplicate Lead");
		return new DuplicateLead(driver,test);
	}
	public MyLeads clickDeleteLead(){
		clickByLink("Delete");
		return new MyLeads(driver,test);		
	}
	public void verifyDuplicateLeadName (String data)
	{
		String firstName = getTextById("viewLead_firstName_sp");
		if(data.equals(firstName))
			reportStep("The text: "+firstName+" matches with the value :"+data, "PASS");	
		else 			
			reportStep("The text: "+firstName+" did not match with the value :"+data, "PASS");
	}
	public FindLead clickFindLeads(){
		clickByLink("Find Leads");	
		return new FindLead(driver,test);
	}
}



























