package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By lgnBtn=By.xpath("//button[@type='submit']");
	
	public void login(String x,String y) {
		WebElement user= wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		user.sendKeys(x);
		driver.findElement(password).sendKeys(y);
		driver.findElement(lgnBtn).click();
		String url=driver.getCurrentUrl();
		if(url.contains("dashboard")) {
			System.out.println(x+" is in HomePage of the page");
		}
		else {
			System.out.println(x+" is not logged in.");
		}
	}
	

}
