package com.www.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPom extends BaseClass {
	TestLocators loc;
		// TODO Auto-generated constructor stub
	@BeforeMethod
	public void test1() {
		// TODO Auto-generated method stub
		getdriver("http://adactin.com/HotelApp/");
	}
	@AfterMethod
	public void close() {
		// TODO Auto-generated method stub
//		closeApplication(driver);
	}
	@org.testng.annotations.Test
	public void test2empty() {
		loc=new TestLocators();
		inputtext(loc.getUserName(), "");
		inputtext(loc.getPass(), "");
		click(loc.getLogin());
	}
	@Test
	private void test3validuname() {
		loc=new TestLocators();
		inputtext(loc.getUserName(), "snehithan");
		inputtext(loc.getPass(), "asdf123");
		click(loc.getLogin());
	}
	@Test
	private void test4validpwd() {
		loc=new TestLocators();
		inputtext(loc.getUserName(), "snehithan");
		inputtext(loc.getPass(), "asdf123");
		click(loc.getLogin());
	
	
}
	@Test
	private void test5validdetail() {
		loc=new TestLocators();
		inputtext(loc.getUserName(), "snehithan");
		inputtext(loc.getPass(), "asdf123");
		click(loc.getLogin());
	}}
