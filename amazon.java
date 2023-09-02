package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("vasansrini218@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("ammaappa");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 11r"+Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		
		driver.findElement(By.className("a-button-inner")).click();
		
		
		
		
//		driver.findElement(By.id("createAccountSubmit")).click();
//			
//		WebElement name=driver.findElement(By.id("ap_customer_name"));
//		name.sendKeys("srini"); 
//		
//		WebElement mobilenumber=driver.findElement(By.id("ap_phone_number"));
//		mobilenumber.sendKeys("9487892582");
		
//		WebElement email=driver.findElement(By.id("ap_email"));
//		email.sendKeys("vasansrini218@gmail.com");
		
//	    WebElement password=driver.findElement(By.id("ap_password"));
//		password.sendKeys("Srini123@");
//	
//		driver.findElement(By.id("continue")).click();
		

	}

}
