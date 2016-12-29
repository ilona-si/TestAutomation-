package com.epam.ta.pages;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.By;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.PageFactory;

public class Dislike extends AbstractPage
{
    private final String BASE_URL = "https://www.youtube.com/watch?v=pRpeEdMmmQ0";
    private final Logger logger = LogManager.getRootLogger();

    //чтобы поставить dislike
    @FindBy(xpath = "//div[@id='watch8-sentiment-actions']//button[@title='Мне не понравилось']")
    private WebElement dislike;


    public Dislike(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    public void dislike()
    {
        driver.navigate().to(BASE_URL);
        dislike.click();
    }

    @Override
    public void openPage()
    {
        driver.navigate().to(BASE_URL);

    }
}
