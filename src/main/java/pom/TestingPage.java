package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(id="Selenium Training")
	private WebElement seleniumTrainingSrc;
	
	@FindBy(id="mycart")
	private WebElement myCart;

	public WebElement getSeleniumTrainingSrc() {
		return seleniumTrainingSrc;
	}

	public WebElement getMyCart() {
		return myCart;
	}
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookIcon;
	
	@FindBy(xpath="(//i[@class='fa fa-instagram'])[2]")
	private WebElement instagramIcon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void facebookIcon() {
		facebookIcon.click();	
	}
	public void instagramIcon() {
		instagramIcon.click();	
	}
}
