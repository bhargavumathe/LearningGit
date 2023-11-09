package PushingThis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupswithidpas {

	@Test

	public void test89() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		String x = "I am the string";

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		String s = driver.findElement(By.xpath("//*[@id=\'content\']/div/p")).getText();

		if (s.contains("Congratulations")) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		driver.close();
	}

}
