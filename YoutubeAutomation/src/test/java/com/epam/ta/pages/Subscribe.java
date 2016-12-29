package com.epam.ta.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ilona on 29.12.2016.
 */
public class Subscribe extends AbstractPage
{

    private final Logger logger = LogManager.getRootLogger();
	private final String SUBSCRIBE_URL = "https://www.youtube.com/user/shakiraVEVO";



    //чтобы подписаться
    @FindBy(xpath = "'(//div[@id='c4-primary-header-contents'])[0][0][1][0][0][0]'")

    private WebElement subscribe;



	public Subscribe(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void subscribe()
	{
		driver.navigate().to(SUBSCRIBE_URL);
		subscribe.click();
		logger.info("subscribe");
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(SUBSCRIBE_URL);

	}

}

