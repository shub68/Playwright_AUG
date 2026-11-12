package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SelectingMultipleOptionsFromDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");
		Playwright ply=Playwright.create();
		Browser br = ply.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.navigate("https://demoqa.com/select-menu");
		page.locator("//*[text()='Select...']/..//following-sibling::div[@class='css-1wy0on6']//div").click();
		ArrayList<String> li=new ArrayList<String>();
		li.add("Green");
		li.add("Black");
		for(String sel:li) {
			page.locator("//*[text()='"+sel+"']").click();
		}
	}

}
