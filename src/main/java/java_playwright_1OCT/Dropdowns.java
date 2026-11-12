package java_playwright_1OCT;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");
		Playwright ply = Playwright.create();
		Browser br = ply.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.navigate("https://www.irctc.co.in/");
		page.waitForLoadState(LoadState.NETWORKIDLE);
		page.waitForLoadState(LoadState.DOMCONTENTLOADED);
		page.locator("//*[text()='English']").click();
		page.locator("//*[text()='All Classes']").click();
		List<String> texts=page.locator("//li[@role='option']//span[@class]").allTextContents();
		boolean elefound=false;
		for(String sel:texts) {
			if(sel.equals("AC First Class ")) {
				page.locator("//*[text()='AC First Class (1A) ']").click();
				elefound=true;
				break;
			}
			if(!elefound) {
				System.out.println("element not found");
			}
		}
		System.out.println(texts);
	}

}
