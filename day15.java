package one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = "C:\\Users\\imson\\OneDrive\\Documents\\QA_Training\\Java\\workspace\\Selenium\\src\\one\\config.properties";

		try {
			FileInputStream fileInput = new FileInputStream(path);
			prop.load(fileInput);
			String url = prop.getProperty("baseUrl");
			String browser = prop.getProperty("browser");
			String un = prop.getProperty("username");
			String pw = prop.getProperty("password");

			// writing the file
			prop.put("city", "irving");
			FileOutputStream output = new FileOutputStream(path);

			if (browser.equals("chrome")) {
				// code to set up browser
				ChromeDriver driver = new ChromeDriver();
				driver.get(url);
				driver.findElement(By.cssSelector("#user-name")).sendKeys(un);
				driver.findElement(By.cssSelector("#password")).sendKeys(pw);
				driver.findElement(By.cssSelector("#login-button")).click();
				;

				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("test case pass");
				} else {
					System.out.println("test case fail");
				}

			} else if (browser.equals("firefox")) {
				// code to set up firefox
			} else if (browser.equals("edge")) {
				// code to edge
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
