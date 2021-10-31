package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;  

	@FindBy(id ="usernameInput-input")
public WebElement emailBox; 
	
	@FindBy(name = "password")
public WebElement passwordBox;
	
	@FindBy(id = "signIn")
public WebElement loginButton;
	
	@FindBy(id = "globalError")
public WebElement globalError;
	
	@FindBy(className = "Error__text")
public WebElement generalError; 
	

	public void openbrowser() throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Selenium Jar\\geckodriver.exe");
		Properties prop = new Properties(); 
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Jar\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		PageFactory.initElements(driver, this);
		
	}

	public void OpenScotiaLoginPage() { 
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=DpopsldUp3o&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRHBvcHNsZFVwM28iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYyNzI0MDk1NiwiaWF0IjoxNjI3MjM5NzU2LCJqdGkiOiJkYzdjODlmNy01OGU2LTRjZmYtOTY0Yy03ZGVjYmI3ZDVkNDUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.QUks-_HWCqHNM_J3Fi36JGRlUZFl-yTjZ9Kw4De8_FvMYn6ViOdr4k78blkF8mlDTlcnZHSmss2BhmhtE9OIscfqSXH-YpzYmku7b7WtbMlX1qkfL_B6UErqc6ooA2OM_IsRcfZYw61B03VQgkFwIxNVMuehF57GypuKSo5zt6R2TQs2L4uuxhjeUT8tWFADg0pjkOiRtWepFF0iNCLWzv2d-TJGqodLFlxbw0dul6cYMao95yO0kmdxy2t8XqjxkQSJ_dWaaN7rUN6Q0hvlojCwIe9B4V_y_S8qf6IHDC9iUtxkWYS064iSu6-_S9CgTlXFciZD1aLgstYc3OqUbA&preferred_environment=");  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void login(String email, String password) throws InterruptedException { 
		
		emailBox.sendKeys(email);
		passwordBox.sendKeys(password);
		loginButton.click();
		Thread.sleep(3000);
		
		
//		driver.findElement(By.id("usernameInput-input")).sendKeys(email);
//		
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//		driver.findElement(By.id("signIn")).click();
//		
//		Thread.sleep(2000);
		
	}
	
	public String readGlobalErr() {

		String actualErr = globalError.getText();
		System.out.println(actualErr);
		return actualErr; 
			
//		String actualErr = driver.findElement(By.id("globalError")).getText();
//		System.out.println(actualErr);
//		return actualErr;
	}
	
	public String readErr() {
		String actualErr = generalError.getText();
		System.out.println(actualErr);
		return actualErr; 
		
	}
	
}
