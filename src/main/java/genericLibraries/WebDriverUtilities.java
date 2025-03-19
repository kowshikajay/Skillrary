package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {

	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBackFromFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
	}
	public void switchTab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
}
