package unit;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UnitTest {

	String browserName = "firefox";

	@Test
	public void test() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.ANDROID);
//		caps.setBrowserName("chrome");
		if (browserName.equalsIgnoreCase("chrome")) {
			caps.setBrowserName("chrome");
			caps.setCapability("chromedriverExecutable", "drivers/chrome.app");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			caps.setCapability("appium:appPackage", "org.mozilla.firefox");
			caps.setCapability("appium:appActivity", ".App");
		}
		// URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, caps);
//		driver.get("https://www.geico.com/");
		driver.get("https://www.geico.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		WebElement amazonLogoElement = driver.findElement(By.id("nav-logo-sprites"));
//		amazonLogoElement.click();

//		WebElement hamburgerMenuElement = driver
//				.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
//		hamburgerMenuElement.click();

	//	driver.close();

	}
}
