package tester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p1 {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kalyani\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.linkText("Sign in")).click();

	driver.findElement(By.id("email_create")).sendKeys("kalyanidonthula44@gmail.com");
	driver.findElement(By.linkText("Create an account")).click();

	WebElement radio1 = driver.findElement(By.id("id_gender2"));
	radio1.click();

	driver.findElement(By.id("customer_firstname")).sendKeys("Kalyani");
	driver.findElement(By.id("customer_lastname")).sendKeys("Donthula");

	driver.findElement(By.id("passwd")).sendKeys("Kalyani#21");

	Select date = new Select(driver.findElement(By.id("days")));
	date.selectByVisibleText("10");

	Select month = new Select(driver.findElement(By.id("months")));
	month.selectByVisibleText("April");

	Select year = new Select(driver.findElement(By.id("years")));
	year.selectByVisibleText("1998");

	driver.findElement(By.id("company")).sendKeys("Home");

	driver.findElement(By.id("address1")).sendKeys("A/123 sion");
	driver.findElement(By.id("city")).sendKeys("Mumbai");
	driver.findElement(By.id("company")).sendKeys("Home");
	driver.findElement(By.cssSelector(" div[title='State']")).sendKeys("New York");
	driver.findElement(By.id("postcode")).sendKeys("40014");

	driver.findElement(By.id("phone_mobile")).sendKeys("9123456789");

	driver.findElement(By.linkText("Register")).click();

	driver.findElement(By.linkText("WOMEN")).click();

	driver.findElement(By.linkText("Blouse")).click();

	driver.findElement(By.id("quantity_wanted")).sendKeys("2");
	driver.findElement(By.id("add_to_cart")).click();

	driver.findElement(By.linkText("Proceed to checkout")).click();

	String total = driver.findElement(By.id("total_price")).getText();
	//driver.findElement(By.xpath("//span[@id='total_price']")).getText();
	//driver.findElement(By.cssSelector("span#total_price")).getText();

	driver.findElement(By.linkText("Proceed to checkout")).click();

	driver.findElement(By.linkText("Proceed to checkout")).click();

	WebElement check1 = driver.findElement(By.id("uniform-cgv"));
	check1.click();

	driver.findElement(By.linkText("Proceed to checkout")).click();

	driver.findElement(By.partialLinkText("bank wire")).click();

	driver.findElement(By.partialLinkText("confirm")).click();

	driver.findElement(By.linkText("Back to Order")).click();

	String price = driver.findElement(By.className("price")).getText();

	if(total.equals(price))
	{
	System.out.println("Test case passes");
	}
	else
	{
	System.out.println("Test case failed");
	}
	}
}
