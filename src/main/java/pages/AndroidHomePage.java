package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class AndroidHomePage implements IHomePage {

	public AndroidHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@text=\"\"]")
	WebElement geicoLogoElement;

	@FindBy(xpath = "//android.widget.Button[@text=\"Go\"]")
	WebElement goButtonElement;

	@FindBy(id = "ssp-service-zip")
	WebElement zipCodeField;

	@Override
	public void clickLogo() {
		try {
			Thread.sleep(4);
			click(geicoLogoElement);
		} catch (NoSuchElementException | InterruptedException e) {

		}

	}

	@Override
		public void clickZipCodeField() {
			try {
				click(zipCodeField);
			} catch (NoSuchElementException e) {
				Assertions.fail();
			}
	}
	@Override
	public void clickGoButton() {
		try {
			click(goButtonElement);
		} catch (NoSuchElementException e) {
			Assertions.fail();
		}
	}

}
