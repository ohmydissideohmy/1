import org.junit.Test;

public class UpVoteTest extends BaseTest {

    @Test
    public void TestUpVote() {

        home_page.pressLoginButton();
        login_page.inputLogin();
        login_page.inputPassword();
        login_page.Logging();
        //song_page.LoginFormCloseCheck();
        home_page.CheckAuth();
        song_page.SongCheck();
        home_page.SongClick();
        song_page.lyricsClick();
        song_page.WaiterVote();
        song_page.upVoteClick();
        song_page.VoteCheck();
        song_page.upVoteClick();
    }
}


