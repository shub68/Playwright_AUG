package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ClosingBrowser {
	
	public static void main(String arg[]) {
		Browser br=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		Page page=br.newPage();
		page.navigate("https://www.facebook.com");
		System.out.println(page.title());
		page.close();
		br.close();
	}

}
