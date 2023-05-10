package com.demoqa.classes;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaAlertsFramesWindows extends UtilClass {
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
	public void clickOnAlert() {
		try {
			//Getting an input from properties file
			String alert_button_locator = p.getProperty("alert_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see an Alert
			clickAnElement(alert_button_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 2)
	public void clickOnAlertAfterFiveSeconds() {
		try {
			//Getting an input from properties file
			String timer_alert_button_locator = p.getProperty("timer_alert_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see an Alert
			clickAnElement(timer_alert_button_locator);
			Thread.sleep(8000);
			//Switch to Alert
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 3)
	public void clickAcceptOnConfirmBox() {
		try {
			//Getting an input from properties file
			String confirmbox_locator = p.getProperty("confirmbox_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see the confirm Box
			clickAnElement(confirmbox_locator);
			Thread.sleep(2000);
			//Switch to Alert
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 4)
	public void clickDismissOnConfirmBox() {
		try {
			//Getting an input from properties file
			String confirmbox_locator = p.getProperty("confirmbox_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see the confirm Box
			clickAnElement(confirmbox_locator);
			Thread.sleep(2000);
			//Switch to Alert
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 5)
	public void clickAcceptOnPromptBox() {
		try {
			//Getting an input from properties file
			String promptbox_locator = p.getProperty("promptbox_locator");
			String promptbox_input = p.getProperty("promptbox_input");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see the prompt Box
			clickAnElement(promptbox_locator);
			Thread.sleep(2000);
			//Switch to Alert
			Alert alert = (Alert) driver.switchTo().alert();
		    Thread.sleep(2000);
			//Sending data to the inputbox
			((Alert) alert).sendKeys(promptbox_input);
			Thread.sleep(2000);
			//ClickOn_OK
			((Alert) alert).accept();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 6)
	public void clickDismissOnPromptBox() {
		try {
			//Getting an input from properties file
			String promptbox_locator = p.getProperty("promptbox_locator");
			String promptbox_input = p.getProperty("promptbox_input");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Alerts
			clickOnAlerts();
			Thread.sleep(2000);
			//Click Button to see the prompt Box
			clickAnElement(promptbox_locator);
			Thread.sleep(2000);
			//Switch to Alert
			Alert alert = (Alert) driver.switchTo().alert();
		    Thread.sleep(2000);
			//Sending data to the inputbox
			((Alert) alert).sendKeys(promptbox_input);
			Thread.sleep(2000);
			//ClickOn_OK
			((Alert) alert).dismiss();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 7)
	public void clickOnNewWindowMessage() {
		try {
			//Getting an input from properties file
			String message_window_locator = p.getProperty("message_window_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Browse_Windows
			clickOnBrowserWindows();
			Thread.sleep(2000);
			//ClickOn_New Message Window
			clickAnElement(message_window_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 8)
	public void clickOnNewTab() {
		try {
			//Getting an input from properties file
			String tab_locator = p.getProperty("tab_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Browse_Windows
			clickOnBrowserWindows();
			Thread.sleep(2000);
			//ClickOn_NewTab
			clickAnElement(tab_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 9)
	public void clickOnNewWindow() {
		try {
			//Getting an input from properties file
			String window_locator = p.getProperty("window_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Browse_Windows
			clickOnBrowserWindows();
			Thread.sleep(2000);
			//ClickOn_NewWindow
			clickAnElement(window_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 10)
	public void clickOnSmallDialog() {
		try {
			//Getting an input from properties file
			String show_small_modal_locator = p.getProperty("show_small_modal_locator");
			String close_small_modal_locator = p.getProperty("close_small_modal_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_ModalDialogs
			clickOnModelDialogOption();
			Thread.sleep(2000);
			//ClickOn_SmallDialog
			clickAnElement(show_small_modal_locator);
			Thread.sleep(2000);
			//ClickOn_Close_On_DialogBox
			clickAnElement(close_small_modal_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 11)
	public void clickOnLargeDialog() {
		try {
			//Getting an input from properties file
			String show_large_modal_locator = p.getProperty("show_large_modal_locator");
			String close_large_modal_locator = p.getProperty("close_large_modal_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//ClickOn_AlertsFrames&Windows	
			clickOnAlertsFramesWindows();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_ModalDialogs
			clickOnModelDialogOption();
			Thread.sleep(2000);
			//ClickOn_SmallDialog
			clickAnElement(show_large_modal_locator);
			Thread.sleep(2000);
			//ClickOn_Close_On_DialogBox
			clickAnElement(close_large_modal_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnModelDialogOption() {
		//Getting an input from properties file
		String model_dialog_locator = p.getProperty("model_dialog_locator");
		clickAnElement(model_dialog_locator);
	}

	public void clickOnBrowserWindows() {
		//Getting an input from properties file
		String browse_windows_locator = p.getProperty("browse_windows_locator");
		clickAnElement(browse_windows_locator);
	}


	public void clickOnAlerts() {
		//Getting an input from properties file
		String alerts_locator = p.getProperty("alerts_locator");
		clickAnElement(alerts_locator);
	}

	public void clickOnAlertsFramesWindows(){
		try {
			//Getting an input from properties file
			String alerts_frames_windows_locator = p.getProperty("alerts_frames_windows_locator");
			//ClickOn_AlertsFrames&Windows	
			clickAnElement(alerts_frames_windows_locator);
			Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
