import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class ResultsPage {

    private final WebElement column = $x("//td[2]");

    private final WebElement secondColumn = $x("//td[3]");

    public List<WebElement> getResults() {
        return List.of(column, secondColumn);
    }
}
