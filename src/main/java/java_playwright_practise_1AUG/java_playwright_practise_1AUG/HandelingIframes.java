package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/*public class HandelingIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		FrameLocator frame=page.frameLocator("//iframe[@id='iframeResult']");
		page.locator("//button[text()='Try it']");
		//frame.locator("//button[text()='Try it']").click();
		page.close();
		conext.close();
		br.close();
	}

}*/

import java.util.ArrayList;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandelingIframes {

	public static void main(String[] args) {

		ArrayList<String> args1 = new ArrayList<>();
		args1.add("--start-maximized");

		Browser br = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args1).setSlowMo(2000));
		BrowserContext conext = br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = conext.newPage();
		
		page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		// 1. Target the iframe using its ID
		FrameLocator frame = page.frameLocator("#iframeResult");
		
		// 2. Perform the action directly inside that frame context
		frame.locator("//button[text()='Try it']").click();
		
		// 3. Print confirmation to the console to verify it worked
		System.out.println("Successfully clicked the 'Try it' button inside the iframe!");

		// Keep the browser open briefly to see the visual result on the page
		page.waitForTimeout(3000); 
		

		Locator  frames=page.locator("iframe");
		for(int i=0;i<frames.count();i++) {
			System.out.println("Name of frame ="+frames.nth(i).getAttribute("name"));
		}
		page.close();
		conext.close();
		br.close();
	}
}

