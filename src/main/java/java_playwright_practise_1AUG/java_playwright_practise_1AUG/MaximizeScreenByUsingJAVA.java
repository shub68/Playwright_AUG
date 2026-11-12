package java_playwright_practise_1AUG.java_playwright_practise_1AUG;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeScreenByUsingJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
		double widht = screensize.getWidth();
		double height =screensize.getHeight();
		
		Browser br = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		BrowserContext context = br.newContext(new Browser.NewContextOptions().setViewportSize((int)widht,(int)height));
		Page page=context.newPage();
		page.navigate("https://www.facebook.com");
		page.close();
		context.close();
		br.close();
	}

}
