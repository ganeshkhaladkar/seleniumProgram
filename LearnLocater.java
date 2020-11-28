package Locater.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Launch Chrome And Login into Gmail");
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement fName = driver.findElement(By.id("firstName"));
		
		WebElement lName = driver.findElement(By.id("lastName"));
		
		WebElement email = driver.findElement(By.xpath("//input[@class=\" mr-sm-2 form-control\"]"));
		
		WebElement mNo = driver.findElement(By.id("userNumber"));
		
		WebElement mRadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		
		//WebElement sub = driver.findElement(By);
		
		
		fName.sendKeys("Ganesh");
		lName.sendKeys("Khaladkar");
		email.sendKeys("abc@gmail.com");
		mNo.sendKeys("9975107920");
		mRadioButton.click();
		//sub.sendKeys("Selunium");

	}

}
