package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossDriver {
    private  CrossDriver(){
    }
      WebDriver driver;
    public   WebDriver getDriver(String browser){
        browser = (browser == null) ? ConfigReader.getProperty("browser") : browser;
        if (driver==null) {
            switch (browser) {
                case "safari" -> {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "headless-chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                }
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                default -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }

        }
        return driver;
    }
    public   void closeDriver(){
        if (driver!=null){ // driver'a deger atanmissa
            driver.close();
            driver=null;
        }
    }
}
