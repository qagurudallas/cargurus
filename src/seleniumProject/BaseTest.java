package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.cargurus.com");
	}
	public void navigatetosearchbyZip() {
		//WebElement tab3 = driver.findElement(By.id("heroSearch-tab-2"));
		WebElement tab3 = driver.findElement(By.className("ft-homepage-search__tabs__cpo"));
		
		tab3.click();
		driver.findElement(By.id("dealFinderZipCPOId")).sendKeys("75006");
		driver.findElement(By.id("dealFinderFormCPO_0")).click();
	}
}
