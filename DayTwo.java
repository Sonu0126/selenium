package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class DayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WebElements Methods
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		// Program 1
		// SendKeys()
//		driver1.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//        WebElement first_name =  driver1.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//        WebElement last_name = driver1.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
//        WebElement email = driver1.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
//        WebElement message = driver1.findElement(By.cssSelector("#contact_form > textarea"));
//        WebElement reset_button = driver1.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
//        
//        first_name.sendKeys("Sonika");
//        last_name.sendKeys("Subedi");
//        email.sendKeys("sonikasubedi@gmail.com");
//        message.sendKeys("This is selenium class");
//        
//        //Click()
//        reset_button.click();
//        
//        //Clear()
//        first_name.clear();
//        
//        //text()
//       WebElement heading =  driver1.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//       String text = heading.getText();
//       System.out.println(text);
//       
		// Program 2
		driver1.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// is displayed()
		WebElement header = driver1.findElement(By.cssSelector("#main-header > h1"));
		boolean h1 = header.isDisplayed();
		System.out.println(h1);

		// is enabled()
//       WebElement enabled_radioB = driver1.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)")); 
//       boolean h2 = enabled_radioB.isEnabled(); 
//       System.out.println(h2); 

		WebElement disabled_radioB = driver1
				.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		boolean h3 = disabled_radioB.isEnabled();
		System.out.println(h3);

		// is selected()
		WebElement isSelected_radioB = driver1
				.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean h4 = isSelected_radioB.isSelected();
		System.out.println(h4);
		// submit()

	}

}
