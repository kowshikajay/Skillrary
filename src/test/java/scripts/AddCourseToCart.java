package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import genericLibraries.PropertyFile;
import genericLibraries.WebDriverUtilities;
import pom.AddToCart;
import pom.SkillraryDemoPage;
import pom.SkillraryHomePage;

public class AddCourseToCart extends BaseClass {
	@Test
	public void addCourseTocart() throws FileNotFoundException, IOException {
		// PropertyFile p=new PropertyFile();
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsbutton();
		s.demoapp();
		utilities.switchTab(driver);
		SkillraryDemoPage d = new SkillraryDemoPage(driver);
		// WebDriverUtilities utilities=new WebDriverUtilities();

		utilities.mouseHover(driver, d.getCoursebutton());
		d.seleniumtraining();
		AddToCart add = new AddToCart(driver);
		utilities.doubleClick(driver, add.getAddButton());
		add.addtocart();
		utilities.alertPopup(driver);

		Assert.assertEquals(driver.getTitle(), p.getData("addToCartTitle"));
		System.out.println("Test Case Passed");
	}

}
