package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class KeyboardActions {

	public static void main(String arg[]) {

		ArrayList<String> arg1 = new ArrayList<String>();
		arg1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new LaunchOptions().setHeadless(false).setSlowMo(2000).setArgs(arg1));
		BrowserContext bcn = br.newContext(new NewContextOptions().setViewportSize(null));
		Page page = bcn.newPage();
		page.navigate("https://www.facebook.com");
		page.locator("//input[@name='email']").type("Shubham Lokare");
		page.keyboard().press("Control+A");
		page.keyboard().press("Control+X");
	}

}
