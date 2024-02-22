package pages;

import static common.CommonActions.click;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IOSHomePage implements IHomePage{
	public IOSHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "")
	 WebElement amazonlogoElement;
	
	@FindBy(xpath = "" )
	WebElement zipCodeField;
	
	@FindBy(xpath = "" )
	WebElement goButtonElement;
	

	@Override
	public void clickLogo() {
		try {
			click(amazonlogoElement);
		} catch (NoSuchElementException e) {
			
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

	@Override
	public void clickZipCodeField() {
		try {
			click(zipCodeField);
		} catch (NoSuchElementException e) {
			Assertions.fail();
		
	}
	}

}
