package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class setup {

    public static WebDriver driver;

    // browser setup
    public static WebDriver setupBrowser(String driverType) {
        if (driverType.equalsIgnoreCase("ch")) {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            //options.setHeadless(true);
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        } else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
           driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}