package testjava;

import org.testng.annotations.Test;

import org.testng.Assert;


public class LoginPageTest extends BaseTest {

	public void verifyUrlOfPage() {
		String url = loginPage.pageUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void verifyTitleOfPage() {
		String title = loginPage.pageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void verifyLoginWithCorrectCred() {
		loginPage.loginMethod("Admin", "admin123");
		boolean verifyLoginSuccessful = dashboardPage.titleOfDashBoard();
		Assert.assertEquals(verifyLoginSuccessful, true);
	}
}



