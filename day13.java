package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// visiting the Url
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// Total No.ofRows
		List<WebElement> table = driver.findElements(By.xpath("//*[table]"));

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		int totalRows = rows.size();
		System.out.println(rows.size());

		// Finding total no.ofColomns
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
		int totalcolumn = column.size();
		System.out.println(column.size());
		// Finding the age of first table rows
		int sum = 0;
		for (int i = 2; i <= totalRows; i++) {
			System.out.println(i);
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
			// System.out.println(text);
			// sum = sum + Integer.parseInt(text);
		}
		System.out.println(sum);

		// find the name michale
		for (int i = 2; i <= totalRows; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[1]")).getText();
			System.out.println(text);
			if (text.equals("Michael")) {
				System.out.println("Test case pass ");
				break;
			}
		}

	}

}
