import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Launch Chrome and login into Facebook ");

		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement  password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		
		username.sendKeys("seemadhumalg@gmail.com");
		password.sendKeys("8149743606");
		loginButton.click();

	}

}
