package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends HomePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[contains(@name, 'login')]")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[contains(@class, 'square_button')]")
    private WebElement signInButton;

    @FindBy(xpath = "//a[contains(@ng-click, '$ctrl.logout()')]")
    private WebElement signOutButton;

    @FindBy(xpath = "//div[contains(@ng-click, 'admin_menu ')]")
    private WebElement userMenu;

    public void inputLogin() {
        inputLogin.sendKeys("ohmywizard");
    }

    public void inputPassword() {
        inputPassword.sendKeys("dankpassword123");
    }

    public void Logging() {
        signInButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(userMenu));
    }

    public void pressUserMenu() {
        userMenu.click();
    }

    public void DeAuth() {
        signOutButton.click();
    }

}
