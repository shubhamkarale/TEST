package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import day1.Base;

public class LoginTests extends Base {

	@Test()
	public void testSuccessfullLogin() {

		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.SetUsername("tomsmith");
		loginPage.SetPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		assertTrue(secureAreaPage.getAlertText().contains(" You logged into a secure area!"),
				"Alert text is incorrect");

	}
}
