import io.qameta.allure.Step;
import org.junit.Assert;

public class MainPage {

    @Step
    public void goToUrl() {
        FirstTest.driver.get("https://habr.com/ru/");
    }

    @Step
    public void checkUrl() {
        String url = FirstTest.driver.getCurrentUrl();
        Assert.assertTrue("Неверный урл", url.startsWith("uyuy"));
    }

}
