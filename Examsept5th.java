package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Examsept5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Select orange a radio button and assert whether it is checked -Q3
		// Arrange
//		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		//Action
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		WebElement orange = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
//		orange.click();
//	    //Assertion
//		boolean o = orange.isSelected();
//		if (o == true) {
//			System.out.println("orange button is selected");
//		} else {
//			System.out.println("orange button not selected");
//		}

		// From first Drop down select Python and assert - Q4
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		// Action
		driver1.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Select python = new Select(driver1.findElement(By.cssSelector("#dropdowm-menu-1")));
		python.selectByVisibleText("Python");
		String expectedele = python.getFirstSelectedOption().getText();

		// Assertion
		if (expectedele.equals("Python")) {
			System.out.println("Python is selected");
		} else {
			System.out.println("Python not selected");
		}

	}

}
