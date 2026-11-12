package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandelingBasicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright ply=Playwright.create();
		Browser br=ply.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext bcn=br.newContext(new NewContextOptions().setHttpCredentials("admin", "admin"));
		Page page=bcn.newPage();
		page.navigate("http://the-internet.herokuapp.com/basic_auth");
	}

}
