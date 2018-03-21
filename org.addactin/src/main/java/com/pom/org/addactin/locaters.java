package com.pom.org.addactin;

import org.addactin.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locaters extends Base {
	
	public locaters() {
		PageFactory.initElements(ottunar, this);
	}
	@FindBy(id="username")
    private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	public WebElement getUname() {
		return uname;
	}

	public void setUname(WebElement uname) {
		this.uname = uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getLog() {
		return log;
	}

	public void setLog(WebElement log) {
		this.log = log;
	}
	@FindBy(id="login")
	private WebElement log;

}
