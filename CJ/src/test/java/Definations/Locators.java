package Definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

	public WebDriver driver;

	public Locators(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	//Locating Web Elements
	//Login Email ID
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement email;

	//Password
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement password;

	//Next Button
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
	@CacheLookup
	WebElement next_for_password;

	//Next Button
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
	@CacheLookup
	WebElement next_for_logingin;

	//Compose Button
	@FindBy(xpath="//div[@class='Yh akV']")
	@CacheLookup
	WebElement compose;

	//To Email ID
	@FindBy(xpath="//textarea[@name='to']")
	@CacheLookup
	WebElement to;

	//Subject Box
	@FindBy(xpath="//input[@name='subjectbox']")
	@CacheLookup
	WebElement subject;

	//Body Box
	@FindBy(xpath="//div[@class='Am Al editable LW-avf tS-tW']")
	@CacheLookup
	WebElement body;

	//Close Compose Box
	@FindBy(xpath="//img[@class='Ha']")
	@CacheLookup
	WebElement close;

	//Send Button
	@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	@CacheLookup
	WebElement send;


	//Setter Functions
	public void setUsername(String uname) {
		email.clear();
		email.sendKeys(uname);
	}

	public void setPassword(String pswd) {
		password.clear();
		password.sendKeys(pswd);
	}

	public void clickNextForPassword() {
		next_for_password.click();
	}

	public void clickNextForLogingin() {
		next_for_logingin.click();
	}

	public void clickCompose() {
		compose.click();
	}

	public void setTo(String too) {
		to.clear();
		to.sendKeys(too);
	}

	public void setSubject(String subjectt) {
		subject.clear();
		subject.sendKeys(subjectt);
	}

	public void setBody(String bodyy) {
		body.clear();
		body.sendKeys(bodyy);
	}

	public void setClose() {
		close.click();
	}

	public void clickSend() {
		send.click();
	}

}



