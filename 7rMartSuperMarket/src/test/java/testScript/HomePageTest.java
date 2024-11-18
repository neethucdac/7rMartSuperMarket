package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	HomePage homepage;
	
@Test
public void verifyUserIsAbleToLogout() throws IOException
{
	 String username= ExcelUtility.readStringData(1, 0, "loginpage"); //sheetname-loginpage
 	 System.out.println(username);
 	 String password = ExcelUtility.readStringData(1, 1,"loginpage"); 
 	 System.out.println(password);
 	/**LoginPage loginpage = new LoginPage(driver); 
 	loginpage.enterUserNamefield(username); 
 	loginpage.enterPasswordfield(password); 
 	loginpage.clickOnsigninbutton();
 	HomePage homepage=new HomePage(driver);
 	homepage.adminClick();
 	homepage.logoutclick();**/
 	LoginPage loginpage = new LoginPage(driver); 
 	loginpage.enterUserNamefield(username); 
 	loginpage.enterPasswordfield(password); 
 	homepage=loginpage.clickOnsigninbutton();
 	//homepage.adminClick();
 	//homepage.AdminUsersClick();
 	//homepage.logoutclick();

 	//homepage.testClick();
 	homepage.AdminUsersClick();
 	 Assert.assertEquals(driver.getTitle(), "Login | 7rmart supermarket", "Logout Failed !");

 	
}
}
