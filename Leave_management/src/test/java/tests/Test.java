package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import pages.*;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions opt=new FirefoxOptions();
		WebDriver driver= new FirefoxDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage log=new LoginPage(driver); 
		log.login("Admin", "admin123");
		
		PimModule pim=new PimModule(driver);
		pim.add("Karthik", "S", "21120", "karthik0327", "Admin@1234");
		
		LeaveModule lea=new LeaveModule(driver);
		lea.leave("Karthik", "10");
		
		log.login("karthik0327", "Admin@1234");
		
		ApplyLeave leav=new ApplyLeave(driver);
		leav.apply();
		
		log.login("Admin", "admin123");
		Approveleave approve=new Approveleave(driver);
		approve.leave();
		
		driver.close();
	}

}
