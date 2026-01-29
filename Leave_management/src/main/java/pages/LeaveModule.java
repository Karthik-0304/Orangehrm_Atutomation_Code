package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveModule {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public LeaveModule(WebDriver driver) {
		this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
	}
	
	By leave=By.xpath("//span[text()='Leave']");
	By entitlement = By.xpath("//span[normalize-space()='Entitlements']");

	By addentitlement=By.xpath("//a[text()='Add Entitlements']");
	By empname= By.xpath("//label[text()='Employee Name']//following::input[1]");
	By auto=By.xpath("//div[@class='oxd-autocomplete-option']//following::span[text()='Karthik  S']");
	By leatype=By.xpath("//label[text()='Leave Type']//following::i[1]");
	By Fmla = By.xpath("//div[@role='option']//span[text()='CAN - FMLA']");
	By days = By.xpath("//label[text()='Entitlement']/following::input[1]");
    By save = By.xpath("//button[@type='submit']");
    By cnfm=By.xpath("//button[text()=' Confirm ']");
    By profile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logout = By.xpath("//a[text()='Logout']");
    
    public void leave(String x,String y) throws InterruptedException {
    	
    	driver.findElement(leave).click();
    	WebElement entil=wait.until(ExpectedConditions.elementToBeClickable(entitlement));
    	entil.click();
    	wait.until(ExpectedConditions.elementToBeClickable(addentitlement)).click();
    	WebElement emp=wait.until(ExpectedConditions.visibilityOfElementLocated(empname));
    	emp.sendKeys(x);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(auto)).click();
    	
    	driver.findElement(leatype).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(Fmla)).click();
		driver.findElement(days).sendKeys(y);
		
		Thread.sleep(1000);
		
		driver.findElement(save).click();
		
		WebElement con=wait.until(ExpectedConditions.visibilityOfElementLocated(cnfm));
		js.executeScript("arguments[0].click();", con);
		
		driver.findElement(profile).click();
        driver.findElement(logout).click();
		
	}

}
