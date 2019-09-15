package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Car extends BaseTest{

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		init();
	}

	@Test(priority=1)
	public void verifypageTitle() {
		
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, "Used Cars, New Cars, Reviews, Photos and Opinions - CarGurus");
		Assert.assertTrue(actualTitle.contains("Used Cars, New Cars"));
		
	}
	//

	@Test(priority=2, enabled=false)
	public void verifyPageTitleAfterSearchByZipcode() {

		navigatetosearchbyZip();
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Carrollton, TX"));
	}
	
	@Test(priority=2)
	public void verifyPageTitleAfterSearchByZipcode1() {
		navigatetosearchbyZip();
		
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Carrollton, TX"));
	}
	
	@Test(priority=3)
	public void verifyHeading() {
		WebElement tab3 = driver.findElement(By.id("heroSearch-tab-2"));
		tab3.click();
		driver.findElement(By.id("dealFinderZipCPOId")).sendKeys("75006");
		driver.findElement(By.id("dealFinderFormCPO_0")).click();
		String head = driver.findElement(By.xpath("//*[@id=\"listingResultsContentBody\"]/div[1]/h1")).getText();
		Assert.assertTrue(head.contains("Used Cars for Sale in Carrollton, TX"));
		
	}
	@Test
	public void test() {
		System.out.println("hello");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
