package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Screenshot {
	public static void main(String[] args) {
	Playwright ply=Playwright.create();
	Browser br=ply.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page=br.newPage();
	page.navigate("https://www.facebook.com");
	page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./screenshot/saple.png")));
	page.locator("//input[@name='email']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("sample2.png")));
}
}
