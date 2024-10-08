import com.codeborne.selenide.Selenide;

public class MainPage {
    public ResultsPage openResultsPage() {
        Selenide.open("https://student.appline.ru/mod/quiz/view.php?id=968");
        return new ResultsPage();
    }
}
