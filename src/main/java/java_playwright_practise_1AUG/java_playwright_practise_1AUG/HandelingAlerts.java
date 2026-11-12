package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandelingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.onDialog(dia->{
			dia.accept();
			System.out.println(dia.message());
			System.out.println(dia.type());
			System.out.println(dia.defaultValue());
		});
		page.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
		page.locator("//*[text()='Log In']").click();

	}

}
