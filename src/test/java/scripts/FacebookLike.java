package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.SkillraryDemoPage;
import pom.SkillraryHomePage;
import pom.TestingPage;

public class FacebookLike extends BaseClass{
	@Test
	public void facebook() throws FileNotFoundException, IOException, InterruptedException {
	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.gearsbutton();
	s.demoapp();
	utilities.switchTab(driver);
	SkillraryDemoPage d=new SkillraryDemoPage(driver);
	Select select=new Select(d.getCourseSelect());
	select.selectByVisibleText(p.getData("course"));
	
	TestingPage t=new TestingPage(driver);
	utilities.dragAndDrop(driver, t.getSeleniumTrainingSrc(), t.getMyCart());
	
	t.facebookIcon();
	Assert.assertEquals(driver.getTitle(),p.getData("facebookTitle"));
	System.out.println("Test Passed");
	}
}
