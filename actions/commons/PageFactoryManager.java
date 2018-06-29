package commons;

import org.openqa.selenium.WebDriver;

import action.deal.DealsBrowseDealAndCostPO;
import action.deal.DealsMaintainPO;
import action.deal.DealsSODLDetailsPO;
import action.deal.DealsSODLSearchAndMaintainPO;
import action.deal.DealsSODLTransactionPO;
import action.deal.DealsSearchPO;
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
	private static DealsBrowseDealAndCostPO dealsBrowserDealAndCostPage;
	private static DealsMaintainPO dealsMaintainPage;
	private static DealsSearchPO dealsSearchPage;
	private static DealsSODLDetailsPO dealsSODLDetailsPage;
	private static DealsSODLSearchAndMaintainPO dealsSODLSearchAndMaintainPage;
	private static DealsSODLTransactionPO dealsSODLTransactionPage;
	
	
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
	
	public static DealsBrowseDealAndCostPO getDealsBrowserDealAndCostPage(WebDriver driver_) {
		if(dealsBrowserDealAndCostPage==null) {
			return new DealsBrowseDealAndCostPO(driver_);
		}
		return dealsBrowserDealAndCostPage;
	}
	
	public static DealsMaintainPO getDealsMaintainPage(WebDriver driver_) {
		if(dealsMaintainPage==null) {
			return new DealsMaintainPO(driver_);
		}
		return dealsMaintainPage;
	}
	
	public static DealsSearchPO getDealsSearchPage(WebDriver driver_) {
		if(dealsSearchPage==null) {
			return new DealsSearchPO(driver_);
		}
		return dealsSearchPage;
	}
	
	public static DealsSODLDetailsPO getDealsSODLDetailsPage(WebDriver driver_) {
		if(dealsSODLDetailsPage==null) {
			return new DealsSODLDetailsPO(driver_);
		}
		return dealsSODLDetailsPage;
	}
	
	public static DealsSODLSearchAndMaintainPO getDealsSODLSearchAndMaintainPage(WebDriver driver_) {
		if(dealsSODLSearchAndMaintainPage==null) {
			return new DealsSODLSearchAndMaintainPO(driver_);
		}
		return dealsSODLSearchAndMaintainPage;
	}
	
	public static DealsSODLTransactionPO getDealsSODLTransactionPage(WebDriver driver_) {
		if(dealsSODLTransactionPage==null) {
			return new DealsSODLTransactionPO(driver_);
		}
		return dealsSODLTransactionPage;
	}

}
