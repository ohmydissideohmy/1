import org.junit.Test;

public class YoutubePlayTest extends BaseTest {
    @Test
    public void YoutubeTest() {
        home_page.SongClick();
        song_page.PlayMusic();
        song_page.PlayCheck();
    }
}
