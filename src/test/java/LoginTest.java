import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void TestAuth() {
        home_page.pressLoginButton();
        login_page.inputLogin();
        login_page.inputPassword();
        login_page.Logging();
        login_page.CheckAuth();

    }

}

