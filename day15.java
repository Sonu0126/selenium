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
		Properties pro = new Properties();
		String path = "C:\\Users\\imson\\OneDrive\\Documents\\QA_Training\\Java\\workspace\\Selenium\\src\\one\\config.properties";

		try {
			FileInputStream fileInput = new FileInputStream(path);
			pro.load(fileInput);
			String url = pro.getProperty("baseurl");
			String browser = pro.getProperty("browser");
			String username = pro.getProperty("username");
			String password = pro.getProperty("password");

			// writing back to the file
			pro.put("city", "nashvill");
			FileOutputStream fileOutput = new FileOutputStream(path);
			// Storing the properties file
			pro.store(fileOutput, "This is a sample properties file");

			if (browser.equals("chrome")) {
				ChromeDriver driver = new ChromeDriver();
				driver.get(url);
				driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
				driver.findElement(By.cssSelector("#password")).sendKeys(password);
				driver.findElement(By.cssSelector("#login-button")).click();

				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("TestCase pass");
				} else {
					System.out.println("TestCase fail");
				}

			} else if (browser.equals("firefox")) {

			} else if (browser.equals("edge")) {

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
