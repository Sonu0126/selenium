package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TestCase 1(getTitle())
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver\\chromedriver\\exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		String expectedTitle = "Swag Labs";
//		String actualTitle = driver.getTitle();
//		if(expectedTitle.equals(actualTitle)) {
//			System.out.println("TestCase 1 pass");
//		}
//		else {
//			System.out.println("TestCase 1 fail");
//		}

		// TestCase 2(getCurrentUrl())
//		String expectedUrl = "inventory";
//		driver.get("https://www.saucedemo.com/");
//		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement login = driver.findElement(By.cssSelector("#login-button"));
//		userName.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
//		login.click();
//		String actualUrl = driver.getCurrentUrl();   //www.saucedemo.com/inventory.html
//		if(actualUrl.contains(expectedUrl)) {
//			System.out.println("TestCase 2 pass");
//		}
//		else {
//			System.out.println("TestCase 2 fail");
//		}

		// TestCase 3 (findElement()-returns one element only)
//		driver.get("https://www.saucedemo.com/");
//		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement login = driver.findElement(By.cssSelector("#login-button"));
//		userName.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
//		login.click();
//		WebElement logo = driver.findElement(By.cssSelector(".app_logo"));
//		if (logo.isDisplayed()) {
//			System.out.println("TestCase 3 pass");
//		} else {
//			System.out.println("TestCase 3 fail");
//		}

		// TestCase 4 (findElements()-returns list of WebElement)
		driver.get("https://www.saucedemo.com/");
		String expectedProduct = "Sauce Labs Backpack";
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		List<WebElement> item = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean productFound = false;
		for (int i = 0; i < item.size(); i++) {
			// System.out.println(item.get(i));
			if (item.get(i).equals(expectedProduct)) {
				productFound = true;
				break;
			}
		}
		if (productFound) {
			System.out.println("Product available");
			System.out.println("Testcase 4 pass");
		} else {
			System.out.println("Product unavailable");
			System.out.println("TestCase 4 fail");
		}

	}

}
