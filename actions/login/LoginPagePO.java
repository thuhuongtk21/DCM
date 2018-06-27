package login;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.Constant;
import commons.PageFactoryManager;
import home.DashboardPagePO;
import inter.home.DashboardPageUI;
import inter.login.LoginPageUI;

public class LoginPagePO extends AbstractPage{
	WebDriver driver;
	private static DashboardPagePO dashboardPage;
	//Constructor
	public LoginPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void inputToUsername() {
		waitForControlVisible(driver, LoginPageUI.USERNAME_TXT);
		sendKeyToElement(driver, LoginPageUI.USERNAME_TXT,Constant.USERNAME);
	}
	
	public void inputToPassword() {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TXT, Constant.PASSWORD);
	}
	
	public DashboardPagePO clickToLoginButton() {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BTN);
		clickToElement(driver, LoginPageUI.LOGIN_BTN);
		return PageFactoryManager.getDashboardPage(driver);
	}
	
	public void loginToApplication() {
		  inputToUsername();
		  inputToPassword();
		  clickToLoginButton();
		  waitForControlVisible(driver, DashboardPageUI.DASH_PAGE_LINK);
	  }

}
