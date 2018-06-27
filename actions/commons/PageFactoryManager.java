package commons;

import org.openqa.selenium.WebDriver;

import action.offer.DealBuilderPO;
import action.offer.OfferAccpetPO;
import action.offer.OfferCreatePO;
import action.offer.OfferMaintainPO;
import action.offer.OfferMassUploadPO;
import action.offer.OfferReviewPO;
import action.offer.OfferSearchPO;
import home.DashboardPagePO;
import login.LoginPagePO;

public class PageFactoryManager {
	private static LoginPagePO loginPage;
	private static DashboardPagePO dashboardPage;
	private static OfferCreatePO offerCreatePage;
	private static DealBuilderPO dealBuilderPage;
	private static OfferReviewPO offerReviewPage;
	private static OfferAccpetPO offerAcceptPage;
	private static OfferSearchPO offerSearchPage;
	private static OfferMaintainPO offerMaintainPage;
	private static OfferMassUploadPO offerMassUploadPage;
	
	public static LoginPagePO getLoginPage(WebDriver driver_) {
		if(loginPage==null) {
			return new LoginPagePO(driver_);
		}
		return loginPage;
	}
	
	public static DashboardPagePO getDashboardPage(WebDriver driver_) {
		if(dashboardPage==null) {
			return new DashboardPagePO(driver_);
		}
		return dashboardPage;
	}
	
	public static OfferCreatePO getOfferCreatePage(WebDriver driver_) {
		if(offerCreatePage==null) {
			return new OfferCreatePO(driver_);
		}
		return offerCreatePage;
		
	}
	
	public static DealBuilderPO getDealBuilderPage(WebDriver driver_) {
		if(dealBuilderPage==null) {
			return new DealBuilderPO(driver_);
		}
		return dealBuilderPage;
	}
	
	public static OfferReviewPO getOfferReviewPage(WebDriver driver_) {
		if(offerReviewPage==null) {
			return new OfferReviewPO(driver_);
		}
		return offerReviewPage;
	}
	
	public static OfferAccpetPO getOfferAcceptPage(WebDriver driver_) {
		if(offerAcceptPage==null) {
			return new OfferAccpetPO(driver_);
		}
		return offerAcceptPage;
	}
	
	public static OfferMaintainPO getOfferMaintainPage(WebDriver driver_) {
		if(offerMaintainPage==null) {
			return new OfferMaintainPO(driver_);
		}
		return offerMaintainPage;
	}
	
	public static OfferSearchPO getOfferSearchPage(WebDriver driver_) {
		if(offerSearchPage==null) {
			return new OfferSearchPO(driver_);
		}
		return offerSearchPage;
	}
	
	public static OfferMassUploadPO getOfferMassUploadPage(WebDriver driver_) {
		if(offerMassUploadPage==null) {
			return new OfferMassUploadPO(driver_);
		}
		return offerMassUploadPage;
	}

}
