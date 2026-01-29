package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyLeave {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public ApplyLeave(WebDriver driver) {
		this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
	}
	
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By lgnBtn=By.xpath("//button[@type='submit']");
	By Lea=By.xpath("//span[text()='Leave']");
	By apply=By.xpath("//a[text()='Apply']");
	By leaType=By.xpath("//div[@class='oxd-select-text-input' and text()='-- Select --']");
	By Fmla = By.xpath("//div[@role='option']//span[text()='CAN - FMLA']");
	By from=By.xpath("//label[text()='From Date']//following::input[1]");
	By To=By.xpath("//label[text()='From Date']//following::input[2]");
	By frdate=By.xpath("//div[@class='oxd-calendar-date' and text()='2']");
	By todate=By.xpath("//div[@class='oxd-calendar-date' and text()='2']");
	By toforwmnth=By.xpath("//button[@class='oxd-icon-button'][2]");
	By Pardaysele=By.xpath("//label[text()='Partial Days']//following::div[@class='oxd-select-text--after']");
	By pardaytyp=By.xpath("//div[@role='option']//following::span[text()='All Days']");
	By durasele=By.xpath("//label[text()='Duration']//following::div[@class='oxd-select-text--after']");
	By duratyp=By.xpath("//div[@role='option']//following::span[text()='Half Day - Morning']");
	By sub=By.xpath("//button[@type='submit']");
	By profile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logout = By.xpath("//a[text()='Logout']");
	
	public void apply() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Lea)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(apply)).click();
		
		Thread.sleep(5000);
		
		driver.findElement(leaType).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Fmla)).click();
//		WebElement ltyp=wait.until(ExpectedConditions.visibilityOfElementLocated(Fmla));
//		String typl=ltyp.getText();
//		System.out.println("Leave Type: "+ typl);
		driver.findElement(from).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(toforwmnth)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(frdate)).click();
		
		//driver.findElement(To).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(todate)).click();
		WebElement save=driver.findElement(sub);
		
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", save);
		
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].click();", save);
//		System.out.println();
		
		Thread.sleep(5000);
		
		driver.findElement(profile).click();
        driver.findElement(logout).click();
	}
	
}
