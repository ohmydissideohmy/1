package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SongPage extends HomePage {
    public SongPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@data-id, '15114295')]")
    WebElement songLyrics;

    @FindBy(xpath = "//span[contains(@ng-if, 'hide_upvote_text')]")
    WebElement upVoteButton;

    @FindBy(xpath = "//div[contains(@class, 'voting-total square_button square_button--transparent voting-total--positive voting-total--animate_press')]")
    WebElement upVoteChecker;

    @FindBy(xpath = "//div[contains(@class, 'song_media_controls-playpause_container')]")
    WebElement playButton;

    @FindBy(xpath = "//iframe[contains(@id, 'widget2')]")
    WebElement YoutubeFrame;

    @FindBy(xpath = "//div[@class = 'header-actions']")
    WebElement SongPageLoggedBar;

    @FindBy(xpath = "//div[@class = 'authentication_form']")
    WebElement LogInFormOverlay;



    public void lyricsClick() {
        songLyrics.click();
    }

    public void upVoteClick() {
        upVoteButton.click();
    }

    public void WaiterVote() {
        Assert.assertTrue(upVoteButton.isDisplayed());
    }

    public void VoteCheck() {
        Assert.assertTrue(upVoteChecker.isDisplayed());
    }

    public void PlayMusic() {
        playButton.click();
    }

    public void PlayCheck() {
        Assert.assertTrue(YoutubeFrame.isDisplayed());
    }
}
