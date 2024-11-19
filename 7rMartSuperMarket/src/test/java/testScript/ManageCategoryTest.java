package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategory;
import utilities.ExcelUtility;


public class ManageCategoryTest extends Base {
	ManageCategory managecategory;
	HomePage homepage;
	@Test
	public void checkNewCategoryAdded() throws IOException
	{
		String username= ExcelUtility.readStringData(1, 0, "loginpage"); //sheetname-loginpage
	 	 System.out.println(username);
	 	 String password = ExcelUtility.readStringData(1, 1,"loginpage"); 
	 	 System.out.println(password);
	 	LoginPage loginpage = new LoginPage(driver); 
	 	loginpage.enterUserNamefield(username); 
	 	loginpage.enterPasswordfield(password); 
	 	homepage=loginpage.clickOnsigninbutton();
	 	managecategory.clickNewButton();
	}

}
