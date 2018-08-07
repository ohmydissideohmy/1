import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void SearchTest() {
        home_page.searchBoxInput("Drake");
        home_page.pressSearchButton();
        search_page.SearchCheck();
    }

}
