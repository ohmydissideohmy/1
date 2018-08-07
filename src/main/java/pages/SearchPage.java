package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends HomePage {

    public SearchPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class, 'mini_card-subtitle')]")
    WebElement cardTitle;


    public void SearchCheck() {
        Assert.assertEquals("Drake", cardTitle.getText());
    }
}
