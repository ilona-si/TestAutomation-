package com.epam.ta.pages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage
{

	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://www.youtube.com/";


	//чтобы открыть регистрацию
	@FindBy(xpath = "//div[@id='yt-masthead-signin']/div")
	private WebElement enterButton;

	// Выбрать input для ввода email
	@FindBy(id = "Email")
	private WebElement inputLogin;

	@FindBy(id  = "next")
	private WebElement next;

	@FindBy(id = "Passwd")
	private WebElement inputPassword;

	@FindBy(id  = "signIn")
	private WebElement signIn;


	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("main page");
		enterButton.click();
		logger.info("Login page opened");
	}

	public void login(String username, String password) throws InterruptedException {
		inputLogin.sendKeys(username);
		next.click();
		logger.info("email performed");
		Thread.sleep(1000);
		inputPassword.sendKeys(password);
		signIn.click();
		logger.info("password performed");
		Thread.sleep(3000);
	}

}
