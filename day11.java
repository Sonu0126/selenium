package one;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		Iterator<String> newTab = window.iterator();
		String parentWindowA = newTab.next();
		System.out.println(parentWindowA);
		String childWindow = newTab.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);

		WebElement title = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		if (title.isDisplayed()) {
			System.out.println("TestCase pass");
		} else {
			System.out.println("Testcase fail");
		}

		driver.switchTo().window(parentWindow);
		driver.getCurrentUrl();
		driver.quit();

	}

}
