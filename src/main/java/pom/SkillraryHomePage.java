package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoappButton;
	
	@FindBy(name="q")
	private WebElement search;	
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement entericon;

	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void gearsbutton() {
		gears.click();
	}
	public void demoapp() {
		demoappButton.click();
	}
	public void searchBox(String courseName) {
		search.sendKeys(courseName);
	}
	public void entericon() {
		entericon.click();
	}
}
