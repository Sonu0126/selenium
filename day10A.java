package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name=\"color\"]"));

		// Locate and select radioButtons
		for (WebElement radioButton : radioButtons) {
			radioButton.click();
			String color = radioButton.getText();
			// System.out.println(color);
			System.out.println("radioButton selected: " + radioButton.isSelected());

		}
		




		
		
	}

}
