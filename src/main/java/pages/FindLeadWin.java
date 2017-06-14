package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadWin extends LeafTapsWrappers{	
	public FindLeadWin(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads")){
			reportStep("This in not Find Lead Page window", "FAIL");
		}		
	}
	public FindLeadWin enterFirstName(String data){
		enterByXpath("(//input[@name='firstName'])", data);
		return this;
	}
	public FindLeadWin enterEmail(String data){
		enterByName("emailAddress",data);
		return this;
	}
	public FindLeadWin enterPhoneNumber(String data){
		enterByName("phoneNumber", "9876543210");
		return this;
	}
	public FindLeadWin enterLeadID(String data){
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
	public FindLeadWin clickFindLeads(){
		clickByXpath("(//*[contains(text(),'Find Leads')])[3]");
		return new FindLeadWin(driver, test);
	}
	public FindLeadWin clickPhoneTab(){
		clickByLink("Phone");
		return new FindLeadWin(driver, test);
	}
	public FindLeadWin clickEmailTab(){
		clickByLink("Email");
		return new FindLeadWin(driver, test);
	}
	public MergeLeads clickFirstLink(){
		clickByXpath("//*[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		switchToParentWindow();
		return new MergeLeads(driver, test);
	}
	public FindLeadWin verifyNoRecords(){
		verifyTextByXpath("//*[text()='No records to display']","No records to display");
		return this;
	}
}

















