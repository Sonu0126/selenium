package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// getting the url
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");

		// IFrame
//		WebElement element = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(element);

		// Switch to Iframe by index
		driver.switchTo().frame(0);
		WebElement home = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
		System.out.println(home.isDisplayed());

		// Switch back to the main content
		driver.switchTo().defaultContent();
		WebElement title = driver.findElement(By.cssSelector("#nav-title"));
		System.out.println(title.isDisplayed());

		// validation of the title of main content
		if (driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("TestCase pass");
		} else {
			System.out.println("TestCase fail");
		}

		// close the browser
		driver.close();

	}

}
