package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeScreenByUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arugments=new ArrayList<>();
		arugments.add("--start-maximized");
		Browser br = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(20000).setArgs(arugments));
        BrowserContext context=br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page=context.newPage();
		page.navigate("https://www.facebook.com");
		System.out.println(page.title());
		page.close();
	}

}
