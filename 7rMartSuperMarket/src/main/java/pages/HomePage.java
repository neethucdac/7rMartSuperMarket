package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver; 
	 
 	public  HomePage(WebDriver driver) { 
 		 
 		this.driver = driver; 
 		PageFactory.initElements(driver,this);
 	}
 		@FindBy(xpath ="//a[@data-toggle='dropdown']") WebElement admin; 
 		@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
 		@FindBy(xpath="//i[@class='nav-icon fas fa-users']") WebElement adminuserrs;
 		@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]") WebElement manageusers;
 		//@FindBy(xpath="//body[@class='sidebar-mini layout-fixed sidebar-collapse']") WebElement collapse;
 		//@FindBy(xpath = "//body[@class='sidebar-mini layout-fixed sidebar-collapse']") WebElement test;
 		public void adminClick()
 		{
 			admin.click();
 		}
 		public void logoutclick()
 		{
 			logout.click();
 		}
 		/**public void collapseclick()
 		{
 			System.out.println("collapseclick");
 			collapse.click();
 		}**/
 		public AdminUser AdminUsersClick()
 		{System.out.println("adminuserclick");
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 			adminuserrs.click();
 			manageusers.click();
 			System.out.println("adminuserclick");
 			return new AdminUser(driver);
 		}
 		/**public HomePage testClick()
 		{
 			test.click();
 			return this;
 		}**/
 		
 		 
 	} 
 	

