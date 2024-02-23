package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import pages.AndroidHomePage;
import pages.IHomePage;
import pages.IOSHomePage;

public class BaseClass {

	static String browserName = "firefox";
	static String platform ="android";
	protected static WebDriver driver;
	protected static IHomePage iHomePage;

	@BeforeAll
	public static void setUp() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setPlatform(Platform.ANDROID);
//		caps.setBrowserName("chrome");
		if (browserName.equalsIgnoreCase("chrome")) {
			caps.setBrowserName("chrome");
			caps.setCapability("chromedriverExecutable", "drivers/chrome.app");
		} else if (browserName.equalsIgnoreCase("firefox") && platform .equalsIgnoreCase("android")) {
			caps.setPlatform(Platform.ANDROID);
			caps.setCapability("appium:appPackage", "org.mozilla.firefox");
			caps.setCapability("appium:appActivity", ".App");
		}
		// URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new RemoteWebDriver(url, caps);
		initPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.geico.com/");
	}
	public static void initPage() { 
//		String platform = System.getProperty("os.name");

		if (platform.equalsIgnoreCase("ios")) {
		iHomePage = new IOSHomePage(driver);
		}else if(platform.equalsIgnoreCase("android")) {
			iHomePage = new AndroidHomePage(driver);
		}
				
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
