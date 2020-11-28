package Dropdown.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		System.out.println("Launch Chrome And learn Static Dropdown in Amezon");
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.travelyaari.com/");
		driver.manage().window().maximize();
		WebElement mngBooking = driver.findElement(By.xpath("//div[@class='manageDrop']"));
		mngBooking.click();
		WebElement prtBtn = driver.findElement(By.linkText("Print"));
		prtBtn.click();

	}

}
