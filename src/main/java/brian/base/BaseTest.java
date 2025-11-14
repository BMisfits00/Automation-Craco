package brian.base;

import brian.utils.ConfigReader;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\palod\\Desktop\\Proyectos Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = ConfigReader.get("base.url");
        if (url == null || url.isBlank()){
            throw new RuntimeException("La propiedad 'base.url' no está definida en config.properties");
        }
        driver.get(url);
    }

//    @AfterMethod
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}