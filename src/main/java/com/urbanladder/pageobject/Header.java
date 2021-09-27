package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.utility.Logging;

public class Header {
	ReusableMethods rm = new ReusableMethods();

	private static Boolean flag = null;
	
	public static boolean getHelp(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.getElement(driver, HeaderUI.help).click();
			if(ReusableMethods.getTitle(driver).contains("Help")){
				flag = true;
				Logging.info("Help Page has been Opened");
			}
		}
		catch(Exception e) {
			Logging.error( "Could not click on Help");
			flag = false;
		}
		return flag;
	}
	
	public static boolean getHomePage(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.getElement(driver, HeaderUI.headerlogo).click();
			flag = true;
			Logging.info("HomePage Open");
		}
		catch(Exception e) {
			flag = false;
			Logging.error( "Could Not go to HomePage");
		}
		return flag;
	}
	
	public static boolean getSale(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.getElement(driver, HeaderUI.sale).click();
			Logging.info("Sale Header Clicked");
			try {
				ReusableMethods.getElement(driver, HeaderUI.dealsofweek).click();
				flag = true;
				Logging.info("Deals of the week clicked");
				if(!ReusableMethods.getTitle(driver).contains("Deals of the Week")) {
					Logging.error( "Title Does not Match");
					flag = false;
				}
				Thread.sleep(2000);
			}
			catch(Exception e) {
				Logging.error( "Could not click Deals of the week");
			}
		}
		catch(Exception e) {
			flag = false;
			Logging.error( "Could Not Click Sale Header");
		}
		return flag;
	}
	
	public static boolean getLiving(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.getElement(driver, HeaderUI.living).click();
			Logging.info("Living Header Clicked");
			try {
				ReusableMethods.getElement(driver, HeaderUI.sofaset).click();
				flag = true;
				Logging.info("Sofa Set Clicked");
				if(!ReusableMethods.getTitle(driver).contains("Sofa")) {
					Logging.error( "Title Does not Match");
					flag = false;
				}
				Thread.sleep(2000);
			}
			catch(Exception e) {
				Logging.error( "Could not click Sofa Set");
			}
		}
		catch(Exception e) {
			flag = false;
			Logging.error( "Could Not Click Living Header");
		}
		return flag;
	}
	
	public static boolean getBedroom(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.getElement(driver, HeaderUI.bedroom).click();
			Logging.info("Bedroom Header Clicked");
			try {
				ReusableMethods.getElement(driver, HeaderUI.beds).click();
				flag = true;
				Logging.info("Beds clicked");
				if(!ReusableMethods.getTitle(driver).contains("Bed")) {
					Logging.error( "Title Does not Match");
					flag = false;
				}
				Thread.sleep(2000);
			}
			catch(Exception e) {
				Logging.error( "Could not click Beds");
			}
		}
		catch(Exception e) {
			flag = false;
			Logging.error( "Could Not Click Bedroom Header");
		}
		return flag;
	}
	
	public static boolean getWishList(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.click(HeaderUI.wishlist, driver);
			flag = true;
			Logging.info("Wishlist Clicked");
		}
		catch(Exception e) {
			flag = false;
			Logging.error( "Could not Click Wishlist");
		}
		return flag;
	}
	
	public static boolean getStoreButton(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.click(HeaderUI.stores, driver);
			flag = true;
			Logging.info("Stores Button Clicked");
		}
		catch(Exception e) {
			flag = false;
			Logging.error("Could not Click Stores Button");
		}
		return flag;
	}
	
	public static boolean getGiftButton(WebDriver driver) {
		flag = null;
		try {
			ReusableMethods.click(HeaderUI.giftcards, driver);
			flag = true;
			Logging.info("Gift Cards Button Clicked");
		}
		catch(Exception e) {
			flag = false;
			Logging.error("Could not Click Gift Cards Button");
		}
		return flag;
	}
}
