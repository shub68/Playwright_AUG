package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.util.ArrayList;

import com.microsoft.playwright.*;

public class launchBrowserInDIfferentBrowsers {
	
	public static void main(String arg[]) {
		
		//firefox
		//ArrayList<String> argu=new ArrayList<String>();
		//argu.add("--start-maximized");
		Browser br=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("firefox").setSlowMo(2000));
		// context=br.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page=br.newPage();
		page.navigate("https://www.facebook.com");
		
	}
	

}
