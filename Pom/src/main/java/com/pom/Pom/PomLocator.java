package com.pom.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLocator extends Base {

	public PomLocator() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="name_3_firstname")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@value='single']")
	private WebElement materialStatus;
	

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getMaterialStatus() {
		return materialStatus;
	}

	public void setMaterialStatus(WebElement materialStatus) {
		this.materialStatus = materialStatus;
	}

	public WebElement getHobbyDance() {
		return hobbyDance;
	}

	public void setHobbyDance(WebElement hobbyDance) {
		this.hobbyDance = hobbyDance;
	}

	public WebElement getHobbyReading() {
		return hobbyReading;
	}

	public void setHobbyReading(WebElement hobbyReading) {
		this.hobbyReading = hobbyReading;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@FindBy(xpath="//input[@value='dance']")
	private WebElement hobbyDance;
	
	@FindBy(xpath="//input[@value='reading']")
	private WebElement hobbyReading;
	
	@FindBy(id="dropdown_7")
	private WebElement country;
	
	@FindBy(id="mm_date_8")
	private WebElement month;
	
	@FindBy(id="dd_date_8")
	private WebElement day;
	
	@FindBy(id="yy_date_8")
	private WebElement year;
	
	@FindBy(id="phone_9")
	private WebElement phoneNumber;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="email_1")
	private WebElement email;
	
	@FindBy(id="description")
	private WebElement description;
	
	@FindBy(id="password_2")
	private WebElement pass;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement confime_password;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getDescription() {
		return description;
	}
	public void setDescription(WebElement description) {
		this.description = description;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getConfime_password() {
		return confime_password;
	}
	public void setConfime_password(WebElement confime_password) {
		this.confime_password = confime_password;
	}
	
	
	


}r
