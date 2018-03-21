package com.pom.Pom;

import org.openqa.selenium.WebDriver;

public class PomRegister extends Base {
public static void main(String[] args) {
	 driver=getDriver("http://demoqa.com/registration/");
	PomLocator loc=new PomLocator();
	setText(loc.getFirstName(), "varun");
	setText(loc.getLastName(),"m");
btnClick(loc.getMaterialStatus());
btnClick(loc.getHobbyDance());
rightClick(driver, loc.getDay());
btnClick(loc.getHobbyReading());
setText(loc.getCountry(),"india");
setText(loc.getMonth(),"10");
setText(loc.getDay(),"22");
setText(loc.getYear(),"1993");
setText(loc.getPhoneNumber(), "9445480620");
setText(loc.getUserName(), "snehithan");
setText(loc.getEmail(), "snehithanvarun93@gmail.com");
setText(loc.getDescription(), "Snehithan is getting good one  ");
setText(loc.getPass(), "snehithnvarun");
setText(loc.getConfime_password(), "varun123");
	
	
}
}