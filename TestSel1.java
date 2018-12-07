package TestPackageSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSel1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//WebDriverWait wait = new WebDriverWait(driver, 60);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://Magento.com");
//WebElement myAccountEle= driver.findElement(By.linkText(“My Account”));
//myAccountEle.click();
}
}
