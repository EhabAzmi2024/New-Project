package JaveClassPackage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {
	WebDriver driver = new ChromeDriver();
	String website = "https://www.saucedemo.com/inventory.html";

	@BeforeTest
	public void myBeforeTest() {
		driver.manage().window().maximize();
		driver.get(website);

	}

	@Test()

	public void login() {

//        
//		String FirstName="Ehab";
//		String LastNmae="Azmi";
//		String username = "Ehab Azmi";
//		String domain = "@gmail.com";
//		String space = "";
//		String phone = "788324254";
//		WebElement Faristname=driver.findElement(By.id("register.firstName"));
//		Faristname.sendKeys(FirstName);
//		WebElement lastname=driver.findElement(By.id("register.lastName"));
//		lastname.sendKeys(LastNmae);
//		WebElement Email = driver.findElement(By.id("register.email"));
//		Email.sendKeys(username.concat(space).concat(domain));
//		WebElement mymobile =driver.findElement(By.id("mobileNumber"));
//		mymobile.sendKeys(phone);
//        System.out.println(username.concat(space).concat(domain));

		String fristname = "standard_user";
		String thepassword = "secret_sauce";

		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(fristname);
		WebElement PassWrod = driver.findElement(By.id("password"));
		PassWrod.sendKeys(thepassword);
		driver.findElement(By.id("login-button")).click();
		List<WebElement> AddToCart = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < AddToCart.size(); i++) {

			AddToCart.get(i).click();
//			AddToCart.get(1).click();
//			AddToCart.get(2).click();
//			AddToCart.get(3).click();
//			AddToCart.get(4).click();
//			AddToCart.get(5).click();
//			
//			

		}

	}
}
