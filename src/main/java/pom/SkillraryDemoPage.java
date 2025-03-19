package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebutton;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTraining;
	
	@FindBy(name="addresstype")
	private WebElement courseSelect;
	
	public WebElement getCourseSelect() {
		return courseSelect;
	}
	public SkillraryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getCoursebutton() {
		return coursebutton;
	}
	public void seleniumtraining() {
		seleniumTraining.click();
	}
}
