package com.demoqa.classes;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
public class UtilClass {
	
	public static WebDriver driver;
	Properties p = loadProperty();
	@BeforeMethod
	public Properties loadProperty(){
		try {
			//Making Connection with input.properties file
			FileInputStream fis = new FileInputStream("C:\\Users\\sasir\\OneDrive\\Desktop\\Sasi\\Workspace\\demoqa\\src\\test\\java\\com\\demoqa\\utils\\input.properties");
			Properties p = new Properties();
			p.load(fis);
			return p;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	public void driverInitialize() {
		try {
			//Opening Firefox Browser and maximize it
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Getting input from properties file
			String urlLink = p.getProperty("urlLink");
			//Launch the Application using URL
			driver.get(urlLink);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public void clickAnElement(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void sendKeysMethod(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void scrollDownTheWebpage() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;  
		js1.executeScript("window.scrollBy(0,500)", "");
	}


}
