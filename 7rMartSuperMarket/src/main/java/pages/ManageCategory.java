package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory {
	WebDriver driver;
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newbuttonaddcategory;

	public ManageCategory clickNewButton()
	{
		newbuttonaddcategory.click();
		return this;
	}
}
