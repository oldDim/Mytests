package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRunner {
    private static WebDriver instance;

    private WebDriverRunner() {
    }

    public static WebDriver getInstance() {
        if (instance == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            instance = new ChromeDriver();
        }
        return instance;
    }
}
