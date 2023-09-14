package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));

		// Locate and select checkbox
		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected())
				checkbox.click();
			System.out.println("Checkbox selected:" + checkbox.isSelected());
		}

		// deselect checkbox
		for (WebElement checkbox : checkboxes) {
			checkbox.click();
			System.out.println("Checkbox selected:" + checkbox.isSelected());

		}

	}

}
