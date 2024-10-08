import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class ApplinePage {

    private final String url = "https://student.appline.ru/login/index.php";
    private final WebElement submitButton = $x("//button[@id='loginbtn']");
    private final WebElement loginInput = $x("//input[@id='username']");

    private final WebElement passwordInput = $x("//input[@id='password']");

    public void open() {
        Selenide.open(url);
    }

    public MainPage login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submitButton.click();
        return new MainPage();
    }
}
