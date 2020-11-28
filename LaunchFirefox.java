import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("We Launch Browser");
		
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();

	}

}
