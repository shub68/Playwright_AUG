package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser br = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		BrowserContext context = br.newContext(new Browser.NewContextOptions().setViewportSize(1366,641));
		Page page=context.newPage();
		page.navigate("https://www.facebook.com");
		page.close();
		context.close();
		br.close();
	}

}
