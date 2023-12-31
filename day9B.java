package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement select1 = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		WebElement select2 = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		WebElement select3 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));

		SelectDropdown(driver, select1, "C#");
		SelectDropdown(driver, select2, "Maven");
		SelectDropdown(driver, select3, "JavaScript");

	}

	public static void SelectDropdown(WebDriver driver, WebElement element, String text) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}
}
