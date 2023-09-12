package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examsept5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate title of page - Q1
//		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		String expectedtitle = "Swag Labs";
//		String actualtitle = driver.getTitle();
//		if (expectedtitle.equals(actualtitle)) {
//			System.out.println("TestCase pass");
//		} else {
//			System.out.println("TestCase fail");
//		}
		// driver.close();

		// Select all the check boxes and assert whether they are checked - Q2
		// Arrange
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Action
		List<WebElement> allCheckboxes = driver1.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkbox : " + Integer.toString(allCheckboxes.size()));
		for (WebElement cb : allCheckboxes) {
			cb.click();
		}
		System.out.println("All checkbox have been checked");

		// Assertion
		for (int i = 0; i < allCheckboxes.size(); i++) {
			System.out.println("Checkboxes :" + allCheckboxes.get(i).getAttribute("value"));
		}
		WebElement ele = driver1.findElement(By.cssSelector("#checkboxes > label:nth-child(5)"));
		boolean e = ele.isSelected();
		if (e) {
			System.out.println("TestCase pass");
		} else {
			System.out.println("TestCase fail");
		}

	}

}
