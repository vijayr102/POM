package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLead extends LeafTapsWrappers{	
	public FindLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This in not Find Lead Page", "FAIL");
		}		
	}
	public FindLead enterFirstName(String data){
		enterByXpath("(//input[@name='firstName'])[3]", data);
		return this;
	}
	public FindLead enterEmail(String data){
		enterByName("emailAddress",data);
		return this;
	}
	public FindLead enterPhoneNumber(String data){
		enterByName("phoneNumber", "9876543210");
		return this;
	}
	public FindLead enterLeadID(String data){
		enterByName("id", data);
		return this;
	}
	public String getLeadID(){
		  String LeadID =getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			return LeadID;		
	}
	public String getName(){
		String LeadID =getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
			return LeadID;		
	}
	public FindLead clickFindLeads(){
		clickByXpath("(//*[contains(text(),'Find Leads')])[4]");
		return new FindLead(driver, test);
	}
	public FindLead clickPhoneTab(){
		clickByLink("Phone");
		return new FindLead(driver, test);
	}
	public FindLead clickEmailTab(){
		clickByLink("Email");
		return new FindLead(driver, test);
	}
	public ViewLead clickFirstLink(){
		clickByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		return new ViewLead(driver, test);
	}
	public FindLead verifyNoRecords(){
		verifyTextByXpath("//*[text()='No records to display']","No records to display");
		return this;
	}
}

















