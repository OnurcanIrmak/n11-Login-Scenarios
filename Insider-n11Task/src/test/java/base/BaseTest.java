package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import logger.TestResultLogger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)

public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }


   /*

    @AfterAll
    public void tearDown() {
        getWebDriver().close();
    }

    */

}