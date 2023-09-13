package one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.cssSelector("#contact-us")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

		System.out.println(driver.getCurrentUrl());
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submitButton = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));

		firstName.sendKeys("Robert");
		lastName.sendKeys("Watson");
		email.sendKeys("rbt_watson@gmail.com");
		comment.sendKeys("I take Qa classes");
		submitButton.click();

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

	}

}
