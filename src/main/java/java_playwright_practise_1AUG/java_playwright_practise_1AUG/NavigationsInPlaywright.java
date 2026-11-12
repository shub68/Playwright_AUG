package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NavigationsInPlaywright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br=Playwright.create().chromium().launch(new LaunchOptions().setHeadless(false).setChannel("msedge").setSlowMo(4000));
		Page page=br.newPage();
		page.navigate("https://www.facebook.com");
	    page.reload();
	    page.navigate("https://www.google.com");
	    page.goBack();
	    page.goForward();
	    page.navigate("https://www.amazon.com");
	}

}
