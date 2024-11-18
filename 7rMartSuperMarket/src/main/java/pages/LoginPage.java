package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	WebDriver driver; 
	 
 	public  LoginPage(WebDriver driver) { 
 		 
 		this.driver = driver; 
 		PageFactory.initElements(driver,this); 
 		 
 		 
 	} 
 	@FindBy(xpath ="//input[@type='text']") WebElement username; 
 	@FindBy(xpath = "//input[@type='password']") WebElement password; 
 	@FindBy(xpath= "//button[@class='btn btn-dark btn-block']") WebElement signIn; 
 	@FindBy(xpath ="//p[text()='Dashboard']") WebElement dashboard; 
 	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement errormessagedisplayed; 
 	 
 	//public void enterUserNamefield(String usernamefield) 
 	public LoginPage enterUserNamefield(String usernamefield) //(chaining of page)

 	{ 
 		username.sendKeys(usernamefield);
		return this; 
 	 
 	} 
 	 
 	//public void enterPasswordfield(String passwordfield) 
 	public LoginPage enterPasswordfield(String passwordfield) //(chaining of page)

 	{ 
 		password.sendKeys(passwordfield);
 		return this;
 	} 
 	 
 	//public void clickOnsigninbutton() { 
 		public HomePage clickOnsigninbutton() {//last method has to be given chaining
 		 WaitUtility waitutility=new WaitUtility();
 		 waitutility.waitForClickingElement(driver, signIn);//to wait for sign in waiting 
 		signIn.click(); 
 		return new HomePage(driver);//rerturns to the homepage
 	} 
 	 
 	public boolean isdashboarddisplayed() { 
 		 
 		return dashboard.isDisplayed(); 
 	} 
 	 
 	public boolean getInvalidConfirmation() { 
 		 
 		return errormessagedisplayed.isDisplayed(); 
 	}

}
