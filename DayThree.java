package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		// TestCase1

		// class="section_header">CONTACT US</h2>
		// There is two ways to find webElement i.e. XPath,CSS Selector

		// tagname
//		WebElement heading2 = driver2.findElement(By.cssSelector("h2"));
//		String q1 = heading2.getText();
//		System.out.println(q1);
		// CONTACT US

		// Class
//		WebElement heading3 = driver2.findElement(By.cssSelector(".section_header"));
//		String q2 = heading3.getText();
//		System.out.println(q2);
		// CONTACT US

		// id
		// <form action="contact_us.php" method="post" id="contact_form">
//       
//		WebElement heading4 = driver2.findElement(By.cssSelector("#contact_form"));
//		boolean q3 = heading4.isDisplayed();
//		System.out.println(q3);
		// True

		// anyAttribute
		// tagName[Attribute = "value"
//		WebElement heading5 = driver2.findElement(By.cssSelector("h2[name=\"contactme\"]"));
//		String q4 = heading5.getText();
//		System.out.println(q4);
//		if(q4.equals("CONTACT US")) {
//			System.out.println("TestCase pass");
//		}
//		else {
//			System.out.println("TestCase fail");
//		}
		// CONTACT US

		// TestCase 2(happy path)
		// Arrange

		// Action
		// driver2.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Sonu");
//		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Bastola");
//		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("imsonikasubedi@gmail.com");
//		driver2.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium class");
//        driver2.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
//		//Assertion
//        boolean q5 = driver2.findElement(By.cssSelector("h1")).isDisplayed(); 
//        if(q5){ 
//         System.out.println("Testcase 2 pass"); 
//        } 
//        else { 
//         System.out.println("Testcase 2 fail"); 
//       } 

		// TestCase 3(Incorrect email address)
//		driver2.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
//        driver2.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Sonu");
//		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Bastola");
//		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("imsonikasubedigmail.com");
//		driver2.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium class");
//        driver2.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
//		
//        boolean q6 = driver2.findElement(By.cssSelector("body")).isDisplayed(); 
//        if(q6){ 
//         System.out.println("TestCase 3 pass"); 
//        } 
//        else { 
//         System.out.println("TestCase 3 fail"); 
//       } 

		// TestCase4
		driver2.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Sonu");
		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Bastola");
		driver2.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("imsonikasubedi@gmail.com");
		driver2.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium class");
		driver2.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();

		String q7 = driver2.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
		System.out.println(q7);
		if (q7.isEmpty()) {
			System.out.println("TestCase pass");
		} else {
			System.out.println("TestCase fail");
		}
	}

}
