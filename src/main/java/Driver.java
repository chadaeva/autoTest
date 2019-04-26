import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }
}
