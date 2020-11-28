package Dropdown.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.out.println("Launch Chrome And learn Static Dropdown in Amezon");
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		//select.selectByVisibleText("Deals");
		//select.selectByIndex(3);
		select.selectByValue("search-alias=pantry");
		//select.deselectByValue("search-alias=pantry");
		

	}

}
