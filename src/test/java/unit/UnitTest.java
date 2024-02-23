package unit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import base.BaseClass;

public class UnitTest extends BaseClass {

	String browserName = "firefox";

	@Test
	public void test() throws InterruptedException {

		WebElement geicoLogoElement = getDriver().findElement(By.xpath("//android.view.View[@text=\"\"]"));

		System.out.println(geicoLogoElement.hashCode());
		System.out.println(geicoLogoElement.isEnabled());
		 System.out.println(geicoLogoElement.getLocation());
		 System.out.println("---------------geicoLogoElement done--------------");
		geicoLogoElement.click();

//		WebElement hamburgerMenuElement = driver
//				.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
//		hamburgerMenuElement.click();

		// under code id working
//		WebElement goButtonElement = driver.findElement(By.xpath("//android.widget.Button[@text=\"Go\"]"));
//		goButtonElement.click();

		WebElement zipCodeField = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"ssp-service-zip\"]"));
		System.out.println(zipCodeField.isEnabled());
		System.out.println(zipCodeField.getSize());
		zipCodeField.click();
		zipCodeField.sendKeys("14201");
		Thread.sleep(5);
		 System.out.println("------------zipCodeField done------------------");

		WebElement goButtonElement = getDriver().findElement(By.xpath("//android.widget.Button[@text=\"Go\"]"));
		System.out.println(goButtonElement.isEnabled());
		System.out.println(goButtonElement.getText());
		System.out.println(goButtonElement.getSize());
		goButtonElement.click();
		Thread.sleep(5);
		 System.out.println("-------------goButtonElement done-----------------");
	}
}
