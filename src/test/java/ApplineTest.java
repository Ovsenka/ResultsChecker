import config.Configuration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ApplineTest {

    @Test
    public void isReadyResults() {
        ApplinePage page = new ApplinePage();
        page.open();
        MainPage mainPage = page.login(Configuration.LOGIN, Configuration.PASSWORD);
        ResultsPage resultPage = mainPage.openResultsPage();
        resultPage
                .getResults()
                .forEach(
                webElement -> assertNotEquals("Еще не оценено", webElement.getText()));
    }
}
