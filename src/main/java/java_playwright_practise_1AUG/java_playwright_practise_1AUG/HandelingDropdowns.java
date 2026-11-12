package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class HandelingDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.navigate("https://www.wikipedia.org");
		
		//Selecting by value
		
		page.selectOption("select", "ar");
		
		//selecting by text
		
		page.selectOption("select", new SelectOption().setLabel("فارسی"));
		
		//selecting by index
		
		page.selectOption("select", new SelectOption().setIndex(4));
		
		//Getting all values from dropdown and printing in on console
		/*page.locator("//select[@id='searchLanguage']").click();
		List<String> alloptions = page.locator("//option[@value]").allTextContents();
		System.out.println(alloptions);*/
		
		List<Locator> values=page.locator("//option[@value]").all();
		for(Locator loc:values) {
			System.out.println(loc.innerText()+"--"+loc.getAttribute("lang"));
		}
	}

}
