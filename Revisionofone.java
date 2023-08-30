package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionofone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrange
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver\\chromedriver\\exe");
		ChromeDriver driver = new ChromeDriver();

		// Action
		// Selecting the elements
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

		// Assertion
		WebElement heading = driver
				.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if (heading.isDisplayed()) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case Fail");
		}

	}

}
