package PushingThis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkboxes {
	@Test

	public void test5() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(" total" + checkboxes.size());
		
		/*for (WebElement chkbx : checkboxes)
		{
			chkbx.click();

		}*/

	}

}
