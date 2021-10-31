package tests;

import org.testng.annotations.Test;

import pages.Loginpage;
import data.DataFile;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {

	 Loginpage lp = new Loginpage();
	 DataFile df = new DataFile();
	 
//	 Xls_Reader d = new Xls_Reader("C:\\WeTransfer\\NikulTest.xlsx");
//	
//	 String wrongemail = "bcjhwch"; 
//	 String wrongpassword = "bhhsahck";
//	 String globalErr = "Please check your card number / username or password and try again.";
//	 String emailwithspecialchar = "bcsjdjb##";
//	 String specialcharerr = "Please enter a username or card number without special characters.";
//	 String emptyemailErr = "Please enter your username or card number.";
//	 String emptypassErr = "Please enter your password."; 
	 
  @Test (priority = 1)
  
  public void loginWithwrongemailAndPassword() throws InterruptedException {
	  
//	  driver.findElement(By.id("usernameInput-input")).sendKeys("sdgadgsrhashfsh");
//		driver.findElement(By.name("password")).sendKeys("dfgfdhgefherfds");
//		driver.findElement(By.id("signIn")).click();
//		Thread.sleep(3000);
	  
	lp.login(df.wrongEmail,df.wrongPassword);
	Assert.assertEquals(lp.readGlobalErr(), df.globalErr);	  
	
//	     if(exeptedErr.equals(actualErr)) {
//	      System.out.println("Test Pass");
//	     }else {
//	      System.out.println("Test Fail");
	     }
	  
  @Test (priority = 2)
  
  public void loginWithInvalidEmail() throws InterruptedException {
	 
	lp.login(df.emailWithSpecialChar, df.wrongPassword);
	Assert.assertEquals(lp.readErr(),df.emailWithSpecialChar);
	
//String expectedErr =  "Please enter a username or card number without special characters.";
//String actualErr = lp.readErr();
//Assert.assertEquals(actualErr, expectedErr);
//	  driver.findElement(By.id("usernameInput-input")).sendKeys("sdgadgsrhashfsh#$");
//			driver.findElement(By.name("password")).sendKeys("dfgfdhgefherfds");
//			driver.findElement(By.id("signIn")).click();
//			Thread.sleep(3000);
//			String execptedErr = "Please enter a username or card number without special characters.";
//			String actualErr = driver.findElement(By.className("Error__text")).getText();
//			System.out.println(actualErr);			
//			Assert.assertEquals(actualErr, execptedErr);
  
  }
  
 @Test (priority = 3)
  
  public void loginwithEmptyEmail() throws InterruptedException {
//  	
//	 driver.findElement(By.id("usernameInput-input")).sendKeys("");
//				driver.findElement(By.name("password")).sendKeys("dfgfdhgefherfds");
//				driver.findElement(By.id("signIn")).click();
//				Thread.sleep(3000);
//				String execptedErr = "Please enter your username or card number.";
//				String actualErr = driver.findElement(By.className("Error__text")).getText();
//				System.out.println(actualErr);
//		lp.login("", "chjschc");
//		String expectedErr = "Please enter your username or card number";
//		String actualErr = lp.readErr();
//		Assert.assertEquals(actualErr, expectedErr);
	 
	 lp.login(" ", df.wrongPassword);
	 Assert.assertEquals(lp.readErr(), df.EmptyEmailErr);
	 
 }
  
 @Test (priority = 4)
 public void loginwithEmptyPassword() throws InterruptedException {
	 lp.login(df.wrongEmail, " ");
	 Assert.assertEquals(lp.readErr(), df.emptyPasswordError);
 	 
//	 driver.findElement(By.id("usernameInput-input")).sendKeys("sdgsgsgs");
//		driver.findElement(By.name("password")).sendKeys("");
//		driver.findElement(By.id("signIn")).click();
//		Thread.sleep(3000);
//
//		String execptedErr = "Please enter your password.";
//		String actualErr = driver.findElement(By.className("Error__text")).getText();
//		System.out.println(actualErr);
//		
//		Assert.assertEquals(actualErr, execptedErr);
	 
//	 lp.login("bchsachjs", "");
//	 String expectedErr = "Please enter your password.";
//	 String actualErr = lp.readErr();
//	 Assert.assertEquals(actualErr, expectedErr);
	 	
 }
 
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
//	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().deleteAllCookies();
//		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=DpopsldUp3o&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRHBvcHNsZFVwM28iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYyNzI0MDk1NiwiaWF0IjoxNjI3MjM5NzU2LCJqdGkiOiJkYzdjODlmNy01OGU2LTRjZmYtOTY0Yy03ZGVjYmI3ZDVkNDUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.QUks-_HWCqHNM_J3Fi36JGRlUZFl-yTjZ9Kw4De8_FvMYn6ViOdr4k78blkF8mlDTlcnZHSmss2BhmhtE9OIscfqSXH-YpzYmku7b7WtbMlX1qkfL_B6UErqc6ooA2OM_IsRcfZYw61B03VQgkFwIxNVMuehF57GypuKSo5zt6R2TQs2L4uuxhjeUT8tWFADg0pjkOiRtWepFF0iNCLWzv2d-TJGqodLFlxbw0dul6cYMao95yO0kmdxy2t8XqjxkQSJ_dWaaN7rUN6Q0hvlojCwIe9B4V_y_S8qf6IHDC9iUtxkWYS064iSu6-_S9CgTlXFciZD1aLgstYc3OqUbA&preferred_environment=");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  lp.openbrowser();
	  lp.OpenScotiaLoginPage(); 
  }

  @AfterMethod
  public void afterMethod() {
	  
//		driver.quit();
	lp.closeBrowser();  
  }

}
