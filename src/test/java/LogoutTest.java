import org.junit.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void TestDeauth() {
        login_page.pressLoginButton();
        login_page.inputLogin();
        login_page.inputPassword();
        login_page.Logging();
        login_page.pressUserMenu();
        login_page.DeAuth();
        home_page.CheckLogout();
    }
}
