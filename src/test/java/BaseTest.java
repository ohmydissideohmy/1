import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import pages.SongPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    protected HomePage home_page;
    protected LoginPage login_page;
    protected SearchPage search_page;
    protected SongPage song_page;


    @BeforeClass
    public static void init() {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

    }

    @Before
    public void openPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        home_page = new HomePage(driver);
        login_page = new LoginPage(driver);
        song_page = new SongPage(driver);
        search_page = new SearchPage(driver);

        home_page.openURL("https://genius.com/");

    }

    @After
    public void closeWindow() {
        driver.close();
    }


    @AfterClass
    public static void Exit() {
        driver.quit();
    }

}