package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class daySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// finding the element By id
//		driver.get("https://www.saucedemo.com/");
//		WebElement ele = driver.findElement(By.id("user-name"));
//		ele.sendKeys("problem_user");
//		driver.close();

		// Find the element By name
//		driver.get("https://www.saucedemo.com/");
//		WebElement ele1 = driver.findElement(By.name("user-name"));
//		ele1.sendKeys("standard_user");
//		driver.close();

		// Find the element By ClassName
//		driver.get("https://www.saucedemo.com/");
//		WebElement ele = driver.findElement(By.className("input_error"));
//		ele.sendKeys("standard_user");
//		
//		List<WebElement> eleList = driver.findElements(By.className("input_error"));
//		eleList.get(1).sendKeys("secret_sauce");
//		driver.close();

		// Find the element By TagName
//		driver.get("https://www.saucedemo.com/");
//	    driver.findElements(By.tagName("input")).get(1).sendKeys("secret_sauce");
//		driver.close();

		// Find the element By CSS Selector
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector(".login_logo"));
		driver.findElement(By.cssSelector("#user-name"));
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector("input[id=\"user_name\"]"));

		// Find the elements By X Path
		// Find the elements By LinkText
		// Find the elements By PartialLinkText

	}

}
