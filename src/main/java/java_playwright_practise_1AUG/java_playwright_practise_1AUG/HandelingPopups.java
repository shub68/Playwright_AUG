package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandelingPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.navigate("https://sso.teachable.com/secure/673/identity/sign_up/email");
		Page popup=page.waitForPopup(()->{
			page.locator("//a[text()='Privacy Policy']").first().click();
		});
		popup.locator("//a[@href='/sign_up']").click();
		popup.close();
	}

}
