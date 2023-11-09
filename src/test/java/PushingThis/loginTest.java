package PushingThis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

	@Test

	public void test1() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

//		String expTitle = "OrangeHRM";
//
//		String actTitle = driver.getTitle();
//		Assert.assertEquals(expTitle, actTitle);
		
		String actText = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
		
		String expText = "Dashboard";
		Assert.assertEquals(expText, actText);
		
		driver.close();
 
	}
}
