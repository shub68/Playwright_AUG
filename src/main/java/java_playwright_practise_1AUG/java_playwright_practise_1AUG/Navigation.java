package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Navigation {

	@Test(priority = 0)
	public void test() {
		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		BrowserContext con = br.newContext();
		Page page = con.newPage();
		page.navigate("https://www.facebook.com");
	}

}
