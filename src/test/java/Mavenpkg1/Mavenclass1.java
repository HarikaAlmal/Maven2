package Mavenpkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mavenclass1 {
	WebDriver dr;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.com/");
		Thread.sleep(300);	
	}
	
	@Test
	public void Test1() {
		System.out.println("---------------------this is Test1------------------");
	}
	
	
	@Test
	public void Test2() {
		System.out.println("---------------------this is Test2------------------");
	}
	@AfterMethod
	
	public void close() {
		System.out.println("---------------------this is closing------------------");
		dr.close();
		
	}
	
	

}
