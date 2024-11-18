package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUser {
	public WebDriver driver; 
	 
 	public  AdminUser(WebDriver driver) { 
 		 
 		this.driver = driver; 
 		PageFactory.initElements(driver,this);
 	}
 	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
 	@FindBy(xpath="//input[@name='username']") WebElement username;
 	@FindBy(xpath="//input[@name='password']") WebElement password;
 	@FindBy(xpath="//select[@id='user_type']") WebElement usertypeelement;
 	@FindBy(xpath ="//i[@class='fa fa-save']") WebElement save;
 	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
 	public AdminUser newClick()
 	{
 		newbutton.click();
 		return this;
 	
 	}
 	public AdminUser addUsername(String newuser)
 	{
 		username.click();
 		username.sendKeys(newuser);
 		return this;
 	}
 	public AdminUser addPassword(String pass)
 	{
 		password.click();
 		password.sendKeys(pass);
 		return this;
 	}
 	public AdminUser userType(int userType)
 	{
 		Select select=new Select(usertypeelement);
 		System.out.println(userType);
 		select.selectByIndex(userType);
 		return this;
 	}
 	public AdminUser clickSave()
 	{
 		save.click();
 		return this;
 	}
 	public boolean alertisDisplayed()
 	{
 		return alert.isDisplayed();
 	}

}
