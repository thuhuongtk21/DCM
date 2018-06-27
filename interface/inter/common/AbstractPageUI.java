package inter.common;

public class AbstractPageUI {
	public static final String MENU_DYNAMIC_LINK = "//a[@href='%s' and text()='%s']";
	public static final String LEAVE_CONFIRM = "//button[text()='Leave Page']";
	public static final String LOADING_BAR = "//span[@class='loading-text' and contains(text(),' Please wait...')]";

}
