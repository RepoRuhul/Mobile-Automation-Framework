package webView;

import org.junit.jupiter.api.Test;

import base.BaseClass;

public class WebViewGeicoTest extends BaseClass {

	@Test
	public void WVTest() throws InterruptedException {
		//Thread.sleep(5000);
		iHomePage.clickLogo();
		//Thread.sleep(5000);
		iHomePage.clickZipCodeField();
		//Thread.sleep(5000);
		iHomePage.clickGoButton();
	}

}
