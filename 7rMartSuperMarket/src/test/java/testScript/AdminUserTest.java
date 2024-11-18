package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUser;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	AdminUser adminuser;
	HomePage homepage;
	@Test
	public void verifyUserIsAbleToClickAdminUsers() throws IOException
	{
		 String username= ExcelUtility.readStringData(1, 0, "loginpage"); //sheetname-loginpage
	 	 System.out.println(username);
	 	 String password = ExcelUtility.readStringData(1, 1,"loginpage"); 
	 	 System.out.println(password);
	 	LoginPage loginpage = new LoginPage(driver); 
	 	loginpage.enterUserNamefield(username); 
	 	loginpage.enterPasswordfield(password); 
	 	homepage=loginpage.clickOnsigninbutton();
		//HomePage homepage = new HomePage(driver); 
		adminuser=homepage.AdminUsersClick();
		adminuser.newClick();
		String newusername= ExcelUtility.readStringData(1, 0, "adduser"); //sheetname-adduser
	 	 System.out.println(newusername);
	 	 String newpassword = ExcelUtility.readIntegerData(1, 1,"adduser"); 
	 	 System.out.println(newpassword);
		adminuser.addUsername(newusername);
		adminuser.addPassword(newpassword);
		//adminuser.addPassword("124568");
		adminuser.userType(2);
		adminuser.clickSave();
		adminuser.alertisDisplayed();
	}
	}



