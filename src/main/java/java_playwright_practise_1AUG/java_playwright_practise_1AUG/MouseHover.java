package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1=new ArrayList<String>();
		args1.add("--start-maximized");
		Browser br=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000).setArgs(args1));
		BrowserContext context=br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page=context.newPage();
		page.navigate("https://the-internet.herokuapp.com/hovers");
		page.locator("//img[@alt='User Avatar']").nth(1).hover();
	}
}
