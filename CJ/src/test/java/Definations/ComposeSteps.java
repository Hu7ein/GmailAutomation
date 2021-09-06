package Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ComposeSteps {
	
	public WebDriver driver;
	public Locators locator;
	EmailValidator ev = new EmailValidator();
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Asus/Desktop/SeleniumProject/chromedriver.exe");
		driver = new ChromeDriver();
	    locator = new Locators(driver);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User opens URL {string}")
	public void user_opens_URL (String url){
		driver.get(url);
	}

	@When("User enter Email as {string}")
	public void user_enter_Email_as(String email){
		locator.setUsername(email);
	}
	
	

	@When("Click on Next for password")
	public void click_on_Next_for_password(){
		locator.clickNextForPassword();
	}

	@When("User enter Password as {string}")
	public void user_enter_Password_as(String password){
		locator.setPassword(password);
	}
	
	@When("Click on Next for loging in")
	public void click_on_Next_for_loging_in() {
		locator.clickNextForLogingin();
	}

	@Then("User Click on Compose Button")
	public void user_Click_on_Compose_Button() {
		locator.clickCompose();
	}

	@Then("User enter To as {string}")
	public void user_enter_To_as(String to) {
		locator.setTo(to);
	}
	
	@When("User enters an invalid Email as {string} and browser closes")
	public void user_enters_invalid_Email_as(String to) {
		if(!ev.isValid(to))
		{
			System.out.println("Email invalid");
			driver.close();
		}
	}
		
	@Then("User enter subject as {string}")
	public void user_enter_subject_as(String subject) {
		locator.setSubject(subject);
	}

	@Then("User enter body as {string}")
	public void user_enter_body_as(String body) {
		locator.setBody(body);
	}

	@Then("User Click on Send Button")
	public void user_Click_on_Send_Button() {
		locator.clickSend();
	}
	
	@Then("Close the Compose Box")
	public void close_the_Compose_Box() {
		locator.setClose();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
}	
