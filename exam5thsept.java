package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam5thsept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate the heading of the page
		// Arrange
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Action
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		String expextedheading = "Dropdown Menu(s), Checkboxe(s) & Radio Button(s)";
		String actualheader = driver.findElement(By.cssSelector("h1")).getText();

		// Assertion
		if (expextedheading.equals(actualheader)) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Testcase fail");
		}
		driver.close();

	}

}
