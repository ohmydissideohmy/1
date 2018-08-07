package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public WebDriver driver;

    @FindBy(xpath = "//a[contains(@class, 'sign_in')]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[contains(@class,'quick_search ')]")
    private WebElement searchBox;

    @FindBy(xpath = "//div[contains(@ng-click, 'submit_form()')]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class, 'header-actions')]")
    private  WebElement loggedNavbar;

    @FindBy(xpath = "//a[contains(@class, 'chart_row')]")
    private WebElement SongButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public void pressLoginButton() {
        loginButton.click();
    }

    public void searchBoxInput( String text) {
        searchBox.sendKeys(text);
    }

    public void pressSearchButton() {
        searchBox.submit();
    }

    public void SongCheck() {
        Assert.assertTrue(SongButton.isDisplayed());
    }

    public void SongClick() {
        SongButton.click();
    }

    public void CheckAuth() {
        Assert.assertTrue(loggedNavbar.isDisplayed());
    }

    public void CheckLogout() {
        Assert.assertTrue(loggedNavbar.isDisplayed());
    }


}
