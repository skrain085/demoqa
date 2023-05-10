package com.demoqa.classes;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaInteractions extends UtilClass{
	 Properties p = loadProperty();
		
		@BeforeMethod
		public void loginToApplication() {
			try {
				 driverInitialize();
				 loadProperty();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		@Test(priority = 1)
		public void selectTheNumbersFromGrid() {
			try {
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Interactions	
				clickOnInteractions();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Selectable
				clickOnSelectable();
				Thread.sleep(2000);
				//Select Grid and Numbers
				selectGridAndNumbers();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 2)
		public void selectTheValuesFromList() {
			try {
				//Getting an input from properties file
				String interactions_webelemet1 = p.getProperty("interactions_webelemet1");
				String interactions_webelemet2 = p.getProperty("interactions_webelemet2");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Interactions	
				clickOnInteractions();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Selectable
				clickOnSelectable();
				Thread.sleep(2000);
				//Finding WebElements and Select
				clickAnElement(interactions_webelemet1);
				Thread.sleep(2000);
				clickAnElement(interactions_webelemet2);
				Thread.sleep(2000);	
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 3)
		public void dragTheElement() {
			try {
				//Getting an input from properties file
				String interactions_draggable_locator = p.getProperty("interactions_draggable_locator");
				String interactions_dragbox_locator = p.getProperty("interactions_dragbox_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Interactions	
				clickOnInteractions();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Dragable
				clickAnElement(interactions_draggable_locator);
				Thread.sleep(2000);
				//Drag it
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement dragMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(interactions_dragbox_locator)));
				Actions actions = new Actions(driver);
				actions.dragAndDropBy(dragMe, 150, 50).perform();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void selectGridAndNumbers(){
			try {
				//Getting an input from properties file
				String interactions_grid_locator = p.getProperty("interactions_grid_locator");
				String interactions_webelement3_locator = p.getProperty("interactions_webelement3_locator");
				String interactions_row_webelement1_locator = p.getProperty("interactions_row_webelement1_locator");
				String interactions_row_webelement2_locator = p.getProperty("interactions_row_webelement2_locator");
				//Select Grid and Numbers
				clickAnElement(interactions_grid_locator);
				Thread.sleep(2000);
				//Finding WebElements and Select
				clickAnElement(interactions_webelement3_locator);
				Thread.sleep(2000);
				clickAnElement(interactions_row_webelement1_locator);
				Thread.sleep(2000);	
				clickAnElement(interactions_row_webelement2_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	    }

		public void clickOnSelectable() {
			//Getting an input from properties file
			String selectable_locator = p.getProperty("selectable_locator");
			clickAnElement(selectable_locator);
		}

		public void clickOnInteractions() {
			//Getting an input from properties file
			String interactions_locator = p.getProperty("interactions_locator");
			clickAnElement(interactions_locator);
		}
		
}
