package task17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {

		// Implements the ChromeDriver Browser

		WebDriver driver = new ChromeDriver();

		// navigates to url

		driver.get("https://www.snapdeal.com/");

		// maximize the window

		driver.manage().window().maximize();

		// Waits for the page to load

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// navigates to signin option

		driver.findElement(By.className("accountInner")).click();

		// login element

		WebElement open = driver.findElement(By.className("newUser"));

		open.click();

		// switching frame

		driver.switchTo().frame(0);

		// finding element fot the email id

		WebElement emailId = driver.findElement(By.xpath("//input[@id='userName']"));

		emailId.sendKeys("santhoshkumar220897@gmail.com");

		// Clicking the Continue option

		WebElement cont = driver.findElement(By.xpath("//button[@id='checkUser']"));

		cont.click();

		// Printing the Otp page element

		WebElement otp = driver.findElement(By.xpath("//div[@id='verifyEmailUC']"));

		System.out.println("Otp Sent to gmail Id:" + otp.getText());

		driver.close();

		// quits the whole browser

		driver.quit();

	}

}

//Output - otp page - mailid-santhoshkumar220897@gmail.com
