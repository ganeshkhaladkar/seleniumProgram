package javaScriptExecuter.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;
import net.bytebuddy.asm.Advice.Return;

public class ExecuteScriptDemo {

	public static void main(String[] args) {
		
		System.out.println("Launch Chrome And learn Java Script Executer");
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 //for showing the alert massage
		 js.executeScript("alert('welcome in guru99');", loginButton);
		 driver.switchTo().alert().dismiss();
		 // if normal click not perform then it is use
		 js.executeScript("arguments[0].click();", loginButton);
		 driver.switchTo().alert().accept();
		 
		 String domainName = js.executeScript("return document.domain;").toString();
		 
		 System.out.println(domainName);
		 
		 String url = js.executeScript("return document.URL;").toString();
		 
		 System.out.println(url);
		 
		 String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);
		
		 /*String title1 = js.executeScript("return document.title;").toString();
		 
		 System.out.println(title1);
		 */

	}

}
