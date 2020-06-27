package day1;

import java.util.List;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.HomePage;

public class Base {

	private WebDriver driver;
	protected HomePage homePage;

	@BeforeClass()
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\TAU\\Resources1\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		homePage = new HomePage(driver);

	}

	@AfterClass()

	public void tearDown() {

		driver.quit();
	}

}
