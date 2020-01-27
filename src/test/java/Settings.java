import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;


class Settings {
    ChromeDriver driver;

    @BeforeEach
    void setUp() {
        System.out.println("Test start");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver79.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    void close() {
        System.out.println("Test close");
        driver.quit();
    }
}
