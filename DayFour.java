package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();

		// TestCase 1
		// Action
//		driver3.get("https://www.saucedemo.com/");
//        login(driver3,"standard_user", "secret_sauce");
//		//Assertion
//       WebElement title =  driver3.findElement(By.cssSelector("#header_container > div.header_secondary_container"));
//       if(title.isDisplayed()) {
//    	   System.out.println("TestCase Pass");
//       }
//       else {
//    	   System.out.println("TestCase Fail");
//       }
//       //TestCase2
//      //Action
//     		driver3.get("https://www.saucedemo.com/");
//             login(driver3,"locked_out_user", "secret_sauce");
//      		//Assertion
//           boolean eMessage = driver3.findElement(By.cssSelector(" h3")).isDisplayed();
//       if(eMessage) {
//    	   System.out.println("TestCase Pass");
//       }
//       else {
//    	   System.out.println("TestCase Fail");
//       }
		// TestCase3
		// Action
//      		driver3.get("https://www.saucedemo.com/");
//              login(driver3,"problem_user", "secret_sauce");
//      		//Assertion
//            WebElement title2 = driver3.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")) ;
//            if(title2.isDisplayed()) {
//            	System.out.println("TestCase pass");
//            }
//            else {
//            	System.out.println("TestCase fail");
//            }
		// TestCase4
		// Action
		driver3.get("https://www.saucedemo.com/");
		login(driver3, "performance_glitch_user", "secret_sauce");
		// Assertion
		WebElement title3 = driver3
				.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if (title3.isDisplayed()) {
			System.out.println("TestCase pass");
		} else {
			System.out.println("TestCase fail");
		}

	}

	public static void login(WebDriver driver3, String username, String password) {
		driver3.findElement(By.cssSelector("#user-name")).sendKeys(username);
		;
		driver3.findElement(By.cssSelector("#password")).sendKeys(password);
		driver3.findElement(By.cssSelector("#login-button")).click();

	}

}
