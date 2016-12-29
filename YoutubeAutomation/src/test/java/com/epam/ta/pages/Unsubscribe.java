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
public class Unsubscribe extends AbstractPage
{

    private final Logger logger = LogManager.getRootLogger();
    private final String UNSUBSCRIBE_URL = "https://www.youtube.com/channel/UCDWcewiFRWdw3qLJycWfz1g";


    public Unsubscribe (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    //чтобы отменить подписку
    @FindBy(xpath = "'(//div[@id='c4-primary-header-contents'])[0][0][1][0][0][0]'")
    private WebElement unsubscribe;


    public void unsubscribe()
    {
        driver.navigate().to(UNSUBSCRIBE_URL);
        unsubscribe.click();
        logger.info("unsubscribe");
    }

    @Override
    public void openPage()
    {
        driver.navigate().to(UNSUBSCRIBE_URL);

    }

}
