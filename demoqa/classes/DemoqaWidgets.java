package com.demoqa.classes;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaWidgets extends UtilClass {
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
		public void clickOnWhereDoesItComeFrom() {
			try {//Getting an input from properties file
				String accordian_where_does_it_come_from_locator = p.getProperty("accordian_where_does_it_come_from_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Accordian
				clickOnAccordian();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				//ClickOn_Where Does it come from?
				clickAnElement(accordian_where_does_it_come_from_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 2)
		public void clickOnWhyDoWeUseIt() {
			try {
				//Getting an input from properties file
				String accordian_why_do_we_use_it_locator = p.getProperty("accordian_why_do_we_use_it_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Accordian
				clickOnAccordian();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Why do we use it?
				clickAnElement(accordian_why_do_we_use_it_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 3)
		public void clickOnSubSubItem1() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem2_locator = p.getProperty("menu_mainitem2_locator");
				String menu_subsublist_locator = p.getProperty("menu_subsublist_locator");
				String menu_subsubitem1_locator = p.getProperty("menu_subsubitem1_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item2
				clickAnElement(menu_mainitem2_locator);
				Thread.sleep(2000);
				//ClickOn_SUB SUB LIST
				clickAnElement(menu_subsublist_locator);
				Thread.sleep(2000);
				//ClickOn_SUB SUB Item1
				clickAnElement(menu_subsubitem1_locator);
				Thread.sleep(2000);	 	 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 4)
		public void clickOnMainItem3() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem3_locator = p.getProperty("menu_mainitem3_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item3
				clickAnElement(menu_mainitem3_locator);
				Thread.sleep(2000);	 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 5)
		public void clickOnMainItem1() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem1_locator = p.getProperty("menu_mainitem1_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item3
				clickAnElement(menu_mainitem1_locator);
				Thread.sleep(2000);	 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 6)
		public void clickOnSubSubItem12() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem2_locator = p.getProperty("menu_mainitem2_locator");
				String menu_subsublist_locator = p.getProperty("menu_subsublist_locator");
				String menu_subsubitem2_locator = p.getProperty("menu_subsubitem2_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item2
				clickAnElement(menu_mainitem2_locator);
				Thread.sleep(2000);
				//ClickOn_SUB SUB LIST
				clickAnElement(menu_subsublist_locator);
				Thread.sleep(2000);
				//ClickOn_SUB SUB Item1
				clickAnElement(menu_subsubitem2_locator);
				Thread.sleep(2000);	 	 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 7)
		public void clickOnSubItem1() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem2_locator = p.getProperty("menu_mainitem2_locator");
				String menu_subitem1_locator = p.getProperty("menu_subitem1_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item2
				clickAnElement(menu_mainitem2_locator);
				Thread.sleep(2000);
				//ClickOn_Sub item1
				clickAnElement(menu_subitem1_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 8)
		public void clickOnSubItem2() {
			try {
				//Getting an input from properties file
				String menu_menu_locator = p.getProperty("menu_menu_locator");
				String menu_mainitem2_locator = p.getProperty("menu_mainitem2_locator");
				String menu_subitem2_locator = p.getProperty("menu_subitem2_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(2000);
				//ClickOn_Menu
				clickAnElement(menu_menu_locator);
				Thread.sleep(2000);
				//ClickOn_Main item2
				clickAnElement(menu_mainitem2_locator);
				Thread.sleep(2000);
				//ClickOn_Sub item2
				clickAnElement(menu_subitem2_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 9)
		public void clickOnProgressbar() {
			try {
				//Getting an input from properties file
				String progressbar_locator = p.getProperty("progressbar_locator");
				String progressbar_start_button_locator = p.getProperty("progressbar_start_button_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_ProgressBar
				clickAnElement(progressbar_locator);
				Thread.sleep(2000);
				//ClickOn_Start_Button
				clickAnElement(progressbar_start_button_locator);
				Thread.sleep(14000); 	 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 10)
		public void clickOnResetButton() {
			try {
				//Getting an input from properties file
				String progressbar_locator = p.getProperty("progressbar_locator");
				String progressbar_start_button_locator = p.getProperty("progressbar_start_button_locator");
				String progressbar_reset_button_locator = p.getProperty("progressbar_reset_button_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_ProgressBar
				clickAnElement(progressbar_locator);
				Thread.sleep(2000);
				//ClickOn_Start_Button
				clickAnElement(progressbar_start_button_locator);
				Thread.sleep(14000); 	
				//ClickOn_Reset_Button
				clickAnElement(progressbar_reset_button_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 11)
		public void clickOnOrigin() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_origin_locator = p.getProperty("tabs_origin_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Origin
				clickAnElement(tabs_origin_locator);
				Thread.sleep(4000); 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 12)
		public void clickOnUse() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_use_locator = p.getProperty("tabs_use_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Use
				clickAnElement(tabs_use_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		@Test(priority = 13)
		public void clickOnUseAndWhat() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_use_locator = p.getProperty("tabs_use_locator");
				String tabs_what_locator = p.getProperty("tabs_what_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Use
				clickAnElement(tabs_use_locator);
				Thread.sleep(2000);
				//ClickOn_What
				clickAnElement(tabs_what_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 14)
		public void clickOnOriginAndWhat() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_origin_locator = p.getProperty("tabs_origin_locator");
				String tabs_what_locator = p.getProperty("tabs_what_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Origin
				clickAnElement(tabs_origin_locator);
				Thread.sleep(2000); 
				//ClickOn_What
				clickAnElement(tabs_what_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 15)
		public void clickOnOriginAndUse() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_origin_locator = p.getProperty("tabs_origin_locator");
				String tabs_use_locator = p.getProperty("tabs_use_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Origin
				clickAnElement(tabs_origin_locator);
				Thread.sleep(2000); 
				//ClickOn_Use
				clickAnElement(tabs_use_locator);
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority = 16)
		public void clickOnUseAndOrigin() {
			try {
				//Getting an input from properties file
				String tabs_locator = p.getProperty("tabs_locator");
				String tabs_use_locator = p.getProperty("tabs_use_locator");
				String tabs_origin_locator = p.getProperty("tabs_origin_locator");
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(7000);
				//ClickOn_Widgets	
				clickOnWidgets();
				Thread.sleep(2000);
				//scrollDown
				scrollDownTheWebpage();
				Thread.sleep(4000);
				//ClickOn_Tabs
				clickAnElement(tabs_locator);
				Thread.sleep(2000);
				//ClickOn_Use
				clickAnElement(tabs_use_locator);
				Thread.sleep(2000);
				//ClickOn_Origin
				clickAnElement(tabs_origin_locator);
				Thread.sleep(2000); 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void clickOnAccordian() {
			//Getting an input from properties file
			String accordian_locator = p.getProperty("");
			clickAnElement(accordian_locator);
		}

		public void clickOnWidgets() {
			//Getting an input from properties file
			String widgets_locator = p.getProperty("");
			clickAnElement(widgets_locator);
		}
}
