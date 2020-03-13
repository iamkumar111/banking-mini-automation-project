package com.inetbanking.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//table[@class='layout']//table/tbody[1]/tr[6]/td[2]/input[1]")
	WebElement txtdob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String dd,String mm,String yyyy) throws InterruptedException {
		
		Actions actions = new Actions(ldriver);
		actions.doubleClick(txtdob).perform();
		actions.sendKeys(mm).build().perform();
		actions.sendKeys(Keys.ARROW_LEFT).build().perform();
		actions.sendKeys(dd).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
		actions.sendKeys(yyyy).build().perform();
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
	
	
	
}
