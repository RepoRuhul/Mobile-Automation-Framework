package webView;

import org.junit.jupiter.api.Test;

import base.BaseClass;

public class WebViewGeicoTest extends BaseClass {

	@Test
	public void WVTest() {
		iHomePage.clickLogo();
		iHomePage.clickGoButton();
		iHomePage.clickZipCodeField();

	}

}
