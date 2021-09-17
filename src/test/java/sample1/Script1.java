package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {
	ExtentSparkReporter reporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp() {
	reporter = new ExtentSparkReporter("myreport.html");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	}
	
	@Test 
	public void TestMethod() {
		
		ExtentTest test = extent.createTest("My first test");
		test.log(Status.INFO, "This shows info");

		 //public static void main(String[] args) throws InterruptedException
		    //{
		        //System.setProperty("webdriver.chrome.driver","C:\\Users\\saisv\\Desktop\\chromedriver_win32\\chromedriver.exe");
		        
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
		        driver.get("http://www.google.com");
		        driver.manage().window().maximize();
		        driver.quit(); 
		    }
	@Test 
	public void TestMethod1() {
		
		ExtentTest test = extent.createTest("My second test");
		test.log(Status.INFO, "This shows info");

		 //public static void main(String[] args) throws InterruptedException
		    //{
		        //System.setProperty("webdriver.chrome.driver","C:\\Users\\saisv\\Desktop\\chromedriver_win32\\chromedriver.exe");
		        
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
		        driver.get("http://www.google.com");
		        driver.manage().window().maximize();
		        driver.quit(); 
	}
	
	@AfterSuite
	public void tearDown() {
	extent.flush();
	}
		}

