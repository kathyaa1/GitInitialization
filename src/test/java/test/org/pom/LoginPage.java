package test.org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.org.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	WebElement usrname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement lgn;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
	WebElement hdr;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	WebElement admin;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement add;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement usrole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement empNme;
	

	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	WebElement uName;
	
	//@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement status;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement cpwd;
	
	
	public WebElement getCpwd() {
		return cpwd;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getEmpNme() {
		return empNme;
	}
	public WebElement getuName() {
		return uName;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getUsrole() {
		return usrole;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getAdmin() {
		return admin;
	}
	public WebElement getHdr() {
		return hdr;
	}
	public WebElement getUsrname() {
		return usrname;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLgn() {
		return lgn;
	}
}
