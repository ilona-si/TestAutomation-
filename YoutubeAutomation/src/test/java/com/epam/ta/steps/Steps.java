package com.epam.ta.steps;

import com.epam.ta.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.epam.ta.pages.Unsubscribe;
import com.epam.ta.pages.Subscribe;
import com.epam.ta.pages.LoginPage;
import com.epam.ta.pages.Like;
import com.epam.ta.pages.Dislike;

public class Steps
{
	private WebDriver driver;
	private final String PROFILE_URI = "https://www.youtube.com/#password";

	private final Logger logger = LogManager.getRootLogger();


	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		driver.quit();
	}



//второй шаг
	public void loginYoutube(String username, String password) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(username, password);

	}

	public boolean checkLoggedIn() {
		String d = driver.getCurrentUrl();
		logger.info(d);
		return driver.getCurrentUrl().equals(PROFILE_URI);
	}

	public void like(){
		Like mainPage = new Like(driver);
		mainPage.openPage();
		mainPage.like();
	}
	public void dislike() {
		Dislike mainPage = new Dislike(driver);
		mainPage.openPage();
		mainPage.dislike();

	}
	public void subscribe(){
		Subscribe subscribe = new Subscribe(driver);
		subscribe.openPage();
		subscribe.subscribe();
	}
	public void unSubscribe(){
		Unsubscribe unsub = new Unsubscribe(driver);
		unsub.openPage();
		unsub.unsubscribe();
	}
}
