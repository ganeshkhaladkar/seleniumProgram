package syncronization.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Launch Chrome And learn Static Dropdown in Amezon");
			
			System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://login.yahoo.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			WebElement useName=driver.findElement(By.xpath("//input[@id='login-username']"));
			
			WebElement nextBtn= driver.findElement(By.xpath("//input[@id='login-signin']"));
			//Thread.sleep(2000);
			
			useName.sendKeys("ganeshkhaladkar");
			nextBtn.click();

		}


	}


