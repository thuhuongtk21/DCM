package tc.offer;

import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageFactoryManager;
import home.DashboardPagePO;
import login.LoginPagePO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TC_01_OfferCreate extends AbstractTest{
	WebDriver driver;
	private LoginPagePO loginPage;
	private DashboardPagePO dashboardPage;
	
  @Parameters({"browser","version"})
  @BeforeClass
  public void beforeClass(String browser, String version) {
	  driver = openMultiBrowser(browser, version);
	  loginPage = PageFactoryManager.getLoginPage(driver);
	  loginPage.loginToApplication();
	  dashboardPage = PageFactoryManager.getDashboardPage(driver);
  }
  @Test
  public void TC_01_UploadFile() {
	  dashboardPage.openOfferCreatePage(driver);
  }
  @AfterClass
  public void afterClass() {
  }

}
