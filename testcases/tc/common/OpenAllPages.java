package tc.common;

import org.testng.annotations.Test;

import action.offer.DealBuilderPO;
import action.offer.OfferCreatePO;
import action.offer.OfferReviewPO;
import commons.AbstractTest;
import commons.PageFactoryManager;
import home.DashboardPagePO;
import login.LoginPagePO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class OpenAllPages extends AbstractTest{
	WebDriver driver;
	private LoginPagePO loginPage;
	private DashboardPagePO dashboardPage;
	private OfferCreatePO offerCreatePage;
	private DealBuilderPO dealBuilderPage;	
	private OfferReviewPO offerReviewPage;
	
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser, String version) {
	  driver = openMultiBrowser(browser, version);
	  loginPage = PageFactoryManager.getLoginPage(driver);
	  loginPage.loginToApplication();
	  dashboardPage = PageFactoryManager.getDashboardPage(driver);
  }
  //@Test
  /*public void TC_01_LoginAndGotoDashboard() {
	  loginPage.inputToUsername();
	  loginPage.inputToPassword();
	  dashboardPage = loginPage.clickToLoginButton();
	  //verifyTrue(dashboardPage.isDashboardPageShowed());
  }*/
  
  @Test
  public void TC_02_OpenMenu() throws Exception {
	  offerCreatePage = dashboardPage.openOfferCreatePage(driver);
	  dealBuilderPage = offerCreatePage.openDealBuilderPage(driver);
	  offerReviewPage = dealBuilderPage.openOfferReviewPage(driver);
	  offerReviewPage.openOfferAcceptPage(driver);
  }
  @AfterTest
  public void afterTest() {
	  closeBrowser(driver);
  }

}
