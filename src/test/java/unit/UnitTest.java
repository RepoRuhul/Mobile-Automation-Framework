package unit;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UnitTest {

	@Test
	public void test() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.ANDROID);
		caps.setBrowserName("chrome");

		//URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, caps);
		driver.get("https://www.geico.com/");
		driver.close();
//
	}
}
