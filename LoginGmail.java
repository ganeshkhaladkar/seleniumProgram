import java.awt.List;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) {
		System.out.println("Launch Chrome And Login into Gmail");
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
		//WebElement nextButton1=driver.findElement(By.xpath("//*[@class=\"VfPpkd-RLmnJb\"]"));
		
		//WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		
		//WebElement nextButton2 = driver.findElement(By.xpath("//*[@class=\"VfPpkd-RLmnJb\"]"));
		
	
		//WebElement learnMore = driver.findElement(By.linkText("Learn more"));
		//WebElement learnMore  = driver.findElement(By.partialLinkText("Learn mo"));
		
		//WebElement createAccount = driver.findElement(By.className("OIPlvf"));
		
		java.util.List<WebElement> findTag = driver.findElements(By.tagName("Button"));
		userName.sendKeys("khaladkarganeshp@gmail.com");
		
		System.out.println(findTag.size());
		//learnMore.click();
		//createAccount.click();
		
		//nextButton1.click();
		
		//password.sendKeys("MH12bu5157");
		
		//nextButton2.click();
		

	}

}
