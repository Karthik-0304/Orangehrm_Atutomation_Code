package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Approveleave {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public Approveleave(WebDriver driver) {
		this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
	}
	
	By leave=By.xpath("//span[text()='Leave']");
	By name=By.xpath("//div[@role='row']//following::div[text()='Karthik  S']");
	By approveBtn = By.xpath("//button[contains(.,'Approve')]");
	By profile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logout = By.xpath("//a[text()='Logout']");
	
	
	public void leave() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(leave)).click();
		
		Thread.sleep(1000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		//WebElement na=driver.findElement(name);
		//js.executeScript("arguments[0].scrollIntoView(true);", na);
		WebElement approve =
			    wait.until(ExpectedConditions.elementToBeClickable(
			        By.xpath("//button[contains(.,'Approve')]")
			    ));
		js.executeScript("arguments[0].scrollIntoView(true);", approve);
		js.executeScript("arguments[0].click();", approve);
		System.out.println("Leave approved successfully.");
		
		Thread.sleep(5000);
		
		driver.findElement(profile).click();
        driver.findElement(logout).click();
		
	}
	
}
