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

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"ssp-service-zip\"]")
	WebElement zipCodeField;

	@Override
	public void clickLogo() {
		try {
			Thread.sleep(4);
			System.out.println(geicoLogoElement.hashCode());
			System.out.println(geicoLogoElement.isEnabled());
			 System.out.println(geicoLogoElement.getLocation());
			click(geicoLogoElement);
		} catch (NoSuchElementException | InterruptedException e) {
			Assertions.fail(e);
		}

	}

	@Override
		public void clickZipCodeField() {
			try {
				System.out.println(zipCodeField.isEnabled());
				System.out.println(zipCodeField.getSize());
				//click(zipCodeField);
				input(zipCodeField, "11144");
			} catch (NoSuchElementException e) {
				Assertions.fail(e);
			}
	}
	@Override
	public void clickGoButton() {
		try {
			System.out.println(goButtonElement.isEnabled());
			System.out.println(goButtonElement.getText());
			System.out.println(goButtonElement.getSize());
			click(goButtonElement);
		} catch (NoSuchElementException e) {
			Assertions.fail(e);
		}
	}

}
