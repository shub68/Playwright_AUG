package java_playwright_1OCT;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class titleOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrr=new ArrayList<String>();
		arrr.add("--start-maximized");
		Browser br= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arrr));
		BrowserContext bcn=br.newContext(new NewContextOptions().setViewportSize(null));
		Page pg=bcn.newPage();
		pg.navigate("https://www.facebook.com");
		System.out.println(pg.title());
		br.close();
		bcn.close();
		pg.close();
	}

}
