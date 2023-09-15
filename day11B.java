package one;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String firstTab = driver.getWindowHandle();
		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		driver.findElement(By.id("to-do-list")).click();
		driver.findElement(By.id("page-object-model")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Iterator<String> newTabs = windows.iterator();
		while (newTabs.hasNext()) {
			String tabs = newTabs.next();
			driver.switchTo().window(tabs);
			if (driver.getTitle().equals("WebDriver | To Do List"))
				;
			System.out.println(driver.getTitle());
			System.out.println("TestCase pass");
			break;
		}
		driver.quit();

	}

}
