import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    static WebDriver driver;

    @Test
    public void testFirst() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage();
        mainPage.goToUrl();
        mainPage.checkUrl();

    }

    @AfterClass
    public static void close() {
        driver.quit();
    }


}
