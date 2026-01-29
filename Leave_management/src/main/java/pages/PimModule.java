package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PimModule {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public PimModule(WebDriver driver) {
		this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
	}
	
	By pim=By.xpath("//span[text()='PIM']");
	By add=By.xpath("//a[text()='Add Employee']");
	By fname=By.xpath("//input[@name='firstName']");
	By lname=By.xpath("//input[@name='lastName']");
	By empid=By.xpath("//label[text()='Employee Id']//following::input[1]");
	By cretogg=By.xpath("//label[text()='Employee Id']//following::input[2]");
	By user=By.xpath("//label[text()='Username']//following::input[1]");
	By pass=By.xpath("//label[text()='Username']//following::input[4]");
	By cnfpass=By.xpath("//label[text()='Username']//following::input[5]");
	By sub=By.xpath("//button[@type='submit']");
	By profile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logout = By.xpath("//a[text()='Logout']");
	
	public void add(String a,String b,String c,String d,String e) throws InterruptedException {
		System.out.println("Employee Details");
		WebElement pi=wait.until(ExpectedConditions.visibilityOfElementLocated(pim));
		pi.click();
		WebElement ademp=wait.until(ExpectedConditions.visibilityOfElementLocated(add));
		ademp.click();
		WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		name.sendKeys(a);
//		String f=name.getText();
		System.out.println("First name: "+a);
		WebElement last=driver.findElement(lname);
		driver.findElement(lname).sendKeys(b);
//		String l=last.getText();
		System.out.println("Last name: "+b);
		driver.findElement(empid).clear();
		WebElement eid=wait.until(ExpectedConditions.visibilityOfElementLocated(empid));
		eid.sendKeys(c);
//		String id=eid.getText();
		System.out.println("Emp id: "+c);
		js.executeScript("window.scrollBy(0,400)");
        js.executeScript("arguments[0].click();", driver.findElement(cretogg));
        
        Thread.sleep(1000);
        
		WebElement save=driver.findElement(sub);
		WebElement uname=wait.until(ExpectedConditions.visibilityOfElementLocated(user));
		uname.sendKeys(d);
//		String user=uname.getText();
		System.out.println("UserName: "+d);
//		WebElement pa=driver.findElement(pass);
//		WebElement cnpa=driver.findElement(cnfpass);
		driver.findElement(pass).sendKeys(e);
//		String pas=pa.getText();
		System.out.println("Password: "+e);
		driver.findElement(cnfpass).sendKeys(e);
		
		
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", save);
		js.executeScript("arguments[0].click();", save);
		System.out.println("Employee is saved Successfully.");
		
		Thread.sleep(10000);
	}

}
