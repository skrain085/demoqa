package com.demoqa.classes;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaElements extends UtilClass {
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
	public void textBoxEnteringAllDetails() {
		try {
			//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_emali_address_locaator = p.getProperty("textbox_emali_address_locaator");
			String textbox_emali_address = p.getProperty("textbox_emali_address");
			String textbox_currentaddress_locator = p.getProperty("textbox_currentaddress_locator");
			String textbox_currentaddress = p.getProperty("textbox_currentaddress");
			String textbox_permanentaddress_locator = p.getProperty("textbox_permanentaddress_locator");
			String textbox_permanentaddress = p.getProperty("textbox_permanentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			//EmailAddess
			sendKeysMethod(textbox_emali_address_locaator,textbox_emali_address);
			Thread.sleep(2000);
			//currentAddress
			sendKeysMethod(textbox_currentaddress_locator,textbox_currentaddress);
			Thread.sleep(2000);
			//permanentAddress
			sendKeysMethod(textbox_permanentaddress_locator,textbox_permanentaddress);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 2)
	public void textBoxEnteringFullName() {
		try {
			//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 3)
	public void textBoxEnteringFullNameAndEmailAddress() {
		try {
			//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_emali_address_locaator = p.getProperty("textbox_emali_address_locaator");
			String textbox_emali_address = p.getProperty("textbox_emali_address");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			//EmailAddess
			sendKeysMethod(textbox_emali_address_locaator,textbox_emali_address);
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void textBoxEnteringNameAndEmailAndCurrentAddress() {
		try {//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_emali_address_locaator = p.getProperty("textbox_emali_address_locaator");
			String textbox_emali_address = p.getProperty("textbox_emali_address");
			String textbox_currentaddress_locator = p.getProperty("textbox_currentaddress_locator");
			String textbox_currentaddress = p.getProperty("textbox_currentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			//EmailAddess
			sendKeysMethod(textbox_emali_address_locaator,textbox_emali_address);
			Thread.sleep(2000);
			//currentAddress
			sendKeysMethod(textbox_currentaddress_locator,textbox_currentaddress);
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 5)
	public void textBoxEnteringFullNameAndCurrentAddress() {
		try {
			//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_currentaddress_locator = p.getProperty("textbox_currentaddress_locator");
			String textbox_currentaddress = p.getProperty("textbox_currentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			//currentAddress
			sendKeysMethod(textbox_currentaddress_locator,textbox_currentaddress);
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 6)
	public void textBoxEnteringFullnameAndPermanentAddress() {
		try {
			//Getting an input from properties file
			String textbox_fullname_locator = p.getProperty("textbox_fullname_locator");
			String textbox_fullname = p.getProperty("textbox_fullname");
			String textbox_permanentaddress_locator = p.getProperty("textbox_permanentaddress_locator");
			String textbox_permanentaddress = p.getProperty("textbox_permanentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//fullName
			sendKeysMethod(textbox_fullname_locator,textbox_fullname);
			Thread.sleep(2000);
			//permanentAddress
			sendKeysMethod(textbox_permanentaddress_locator,textbox_permanentaddress);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 7)
	public void textBoxEnteringEmailAndCurrentaddress() {
		try {
			//Getting an input from properties file
			String textbox_emali_address_locaator = p.getProperty("textbox_emali_address_locaator");
			String textbox_emali_address = p.getProperty("textbox_emali_address");
			String textbox_currentaddress_locator = p.getProperty("textbox_currentaddress_locator");
			String textbox_currentaddress = p.getProperty("textbox_currentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//EmailAddess
			sendKeysMethod(textbox_emali_address_locaator,textbox_emali_address);
			Thread.sleep(2000);
			//currentAddress
			sendKeysMethod(textbox_currentaddress_locator,textbox_currentaddress);
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 8)
	public void textBoxEnteringEmailAndPermanentAddress() {
		try {
			//Getting an input from properties file
			String textbox_emali_address_locaator = p.getProperty("textbox_emali_address_locaator");
			String textbox_emali_address = p.getProperty("textbox_emali_address");
			String textbox_permanentaddress_locator = p.getProperty("textbox_permanentaddress_locator");
			String textbox_permanentaddress = p.getProperty("textbox_permanentaddress");
			String textbox_submit_button_locator = p.getProperty("textbox_submit_button_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndTextbox();
			//EmailAddess
			sendKeysMethod(textbox_emali_address_locaator,textbox_emali_address);
			Thread.sleep(2000);
			//permanentAddress
			sendKeysMethod(textbox_permanentaddress_locator,textbox_permanentaddress);
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(2000);
			//submit
			clickAnElement(textbox_submit_button_locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 9)
	public void checkAllOptionsUnderHome() {
		try {
			//Getting an input from properties file
			String checkbox_home_locator = p.getProperty("checkbox_home_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndCheckbox();
			//Click on Home -- It should check all the check boxes
			clickAnElement(checkbox_home_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 10)
	public void checkAllOptionsUnderDownloads() {
		try {
			//Getting an input from properties file
			String checkbox_tree_locator = p.getProperty("checkbox_tree_locator");
			String checkbox_downloads_locator = p.getProperty("checkbox_downloads_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndCheckbox();
			//Click on DownArrow to open the check box tree
			clickAnElement(checkbox_tree_locator);
			Thread.sleep(2000);
			//Click on CheckBox_Downloads
			clickAnElement(checkbox_downloads_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 11)
	public void checkAllOptionsUnderDocuments() {
		try {
			//Getting an input from properties file
			String checkbox_tree_locator = p.getProperty("checkbox_tree_locator");
			String checkbox_documents_locator = p.getProperty("checkbox_documents_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndCheckbox();
			//Click on DownArrow to open the check box tree
			clickAnElement(checkbox_tree_locator);
			Thread.sleep(2000);
			//Click on CheckBox_Documents
			clickAnElement(checkbox_documents_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 12)
	public void checkAllOptionsUnderDesktop() {
		try {
			//Getting an input from properties file
			String checkbox_tree_locator = p.getProperty("checkbox_tree_locator");
			String checkbox_desktop_locator = p.getProperty("checkbox_desktop_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementAndCheckbox();
			//Click on DownArrow to open the check box tree
			clickAnElement(checkbox_tree_locator);
			Thread.sleep(2000);
			//Click on CheckBox_Desktop
			clickAnElement(checkbox_desktop_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 13)
	public void selectYesOption() {
		try {
			//Getting an input from properties file
			String radio_button_yes_locator = p.getProperty("radio_button_yes_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementsAndRadioButton();
			//Click_Yes
			WebElement radioEle = findingWebElement(radio_button_yes_locator);
			boolean select = radioEle.isSelected();
			// performing click operation if element is not already selected
			if (select == false) {
				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("arguments[0].click();", radioEle);
			}
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 14)
	public void selectImpressiveOption() {
		try {//Getting an input from properties file
			String radio_button_impressive_locator = p.getProperty("radio_button_impressive_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			clickOnElementsAndRadioButton();
			//Click_impressive
			WebElement radioEle = findingWebElement(radio_button_impressive_locator);
			boolean select = radioEle.isSelected();
			System.out.print(select);
			// performing click operation if element is not already selected
			if (select == false) {
				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("arguments[0].click();", radioEle);
			}
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 15)
	public void clickOnDoubleClickMe() {
		try {
			//Getting an input from properties file
			String button_doublclick_locator = p.getProperty("button_doublclick_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//ClickOn Button
			clickOnButton();
			Thread.sleep(2000);
			//double_click
			WebElement double_click = findingWebElement(button_doublclick_locator);
			Actions act = new Actions(driver);
			act.doubleClick(double_click).perform();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 16)
	public void clickOnRightClickMe() {
		try {
			//Getting an input from properties file
			String button_rightclick_locator = p.getProperty("button_rightclick_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//ClickOn Button
			clickOnButton();
			Thread.sleep(2000);
			//right_click
			WebElement right_click = findingWebElement(button_rightclick_locator);
			Actions action = new Actions(driver);
			action.contextClick(right_click).perform();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 17)
	public void clickOnClickMe() {
		try {//Getting an input from properties file
			String button_dynamicclick_locator = p.getProperty("button_dynamicclick_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//ClickOn Button
			clickOnButton();
			Thread.sleep(2000);
			//click
			WebElement click_action = findingWebElement(button_dynamicclick_locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", click_action);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 18)
	public void clickOnUpload() {
		try {
			//Getting an input from properties file
			String upload_download_locator = p.getProperty("upload_download_locator");
			String upload_locator = p.getProperty("upload_locator");
			String upload_filepath = p.getProperty("upload_filepath");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Upload and Download
			clickAnElement(upload_download_locator);
			Thread.sleep(2000);
			//ClickOn_Upload
			sendKeysMethod(upload_locator,upload_filepath);
			Thread.sleep(6000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 19)
	public void clickOnDownload() {
		try {
			//Getting an input from properties file
			String upload_download_locator = p.getProperty("upload_download_locator");
			String download_locator = p.getProperty("download_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_Upload and Download
			clickAnElement(upload_download_locator);
			Thread.sleep(2000);
			//ClickOn_Download
			clickAnElement(download_locator);
			Thread.sleep(6000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 20)
	public void fetchingEmailAddressfromWebtable() {
		try {
			//Getting an input from properties file
			String webtable_locator = p.getProperty("webtable_locator");
			String webtable_emailaddress_locator = p.getProperty("webtable_emailaddress_locator");
			String webtable_emailaddress_contains_value = p.getProperty("webtable_emailaddress_contains_value");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_WebTable
			clickAnElement(webtable_locator);
			Thread.sleep(2000);
			//Printing_EmailAddress
			List <WebElement> table = findingWebElements(webtable_emailaddress_locator);
			Iterator<WebElement> list = table.iterator();
			while(list.hasNext()) {
				String value = list.next().getText();
				if(value.contains(webtable_emailaddress_contains_value)) {
				   System.out.println(value);
				 }
			}
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 21)
	public void fetchingAllDetailsFromWebtable() {
		try {
			//Getting an input from properties file
			String webtable_locator = p.getProperty("webtable_locator");
			String webtable_alldetails_locator = p.getProperty("webtable_alldetails_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_WebTable
			clickAnElement(webtable_locator);
			Thread.sleep(2000);
			List <WebElement> table = findingWebElements(webtable_alldetails_locator);
			Iterator<WebElement> list = table.iterator();
			while(list.hasNext()) {
				 System.out.print(list.next().getText());
			}
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 22)
	public void fetchingFirstName() {
		try {//Getting an input from properties file
			String webtable_locator = p.getProperty("webtable_locator");
			String webtable_firstname_locator = p.getProperty("webtable_firstname_locator");
			//scrollDown
			scrollDownTheWebpage();
			Thread.sleep(7000);
			//Elements	
			clickOnElements();
			Thread.sleep(2000);
			//scrollDown
			scrollDownTheWebpage();
			//ClickOn_WebTable
			clickAnElement(webtable_locator);
			Thread.sleep(2000);
			//Printing_FirstName
			List <WebElement> table = findingWebElements(webtable_firstname_locator);
			Iterator<WebElement> list = table.iterator();
			while(list.hasNext()) {
				System.out.println(list.next().getText());
			}
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<WebElement> findingWebElements(String locator) {
		return driver.findElements(By.xpath(locator));
	}


	public void clickOnButton() {
		//Getting an input from properties file
		String button_locator = p.getProperty("button_locator");
		//Button
		clickAnElement(button_locator);
	}

	public WebElement findingWebElement(String locator) {
		return driver.findElement(By.xpath(locator));
	}

	public void clickOnElementsAndRadioButton(){
		try {
			//Getting an input from properties file
			String radio_button_locator = p.getProperty("radio_button_locator");
			//Elements	
			clickOnElements();
			//RadioButton
			driver.findElement(By.xpath(radio_button_locator)).click();
			Thread.sleep(7000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnElements(){
		try {//Getting an input from properties file
			String elements_locator = p.getProperty("elements_locator");
			//Elements	
			clickAnElement(elements_locator);
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void clickOnElementAndCheckbox(){
		try {
			//Getting an input from properties file
			String checkbox_locator = p.getProperty("checkbox_locator");
			//Elements	
			clickOnElements();
			//checkBox
			clickAnElement(checkbox_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnElementAndTextbox(){
		try {
			//Getting an input from properties file
			String textbox_locator = p.getProperty("textbox_locator");
			//Elements	
			clickOnElements();
			//TextBox
			clickAnElement(textbox_locator);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
