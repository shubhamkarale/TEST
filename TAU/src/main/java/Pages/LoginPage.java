package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 private WebDriver driver;
	    private By usernameField = By.id("username");
	    private By passwordField = By.id("password");
	    private By loginButton = By.xpath("//*[@id=\"login\"]/button/i");
	    public LoginPage(WebDriver driver) {

	        this.driver = driver;
	    }

	    public void SetUsername(String username){

	        driver.findElement(usernameField).sendKeys(username);

	    }
	    public void SetPassword(String password){

	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public  SecureAreaPage clickLoginButton(){
	        driver.findElement(loginButton).click();
	        return new SecureAreaPage(driver);

	    }


}
