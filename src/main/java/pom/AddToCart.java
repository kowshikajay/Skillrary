package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(id="add")
	private WebElement addButton;
	
	@FindBy(xpath=" //button[text()=' Add to Cart']")
	private WebElement addToCart;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addtocart() {
		addToCart.click();
	}

	public WebElement getAddButton() {
		return addButton;
	}
}
