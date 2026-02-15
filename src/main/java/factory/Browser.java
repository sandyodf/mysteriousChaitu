package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    private WebDriver driver;

    public WebDriver initiateBrowser(String browser) {

        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("please enter valid browser");
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

}
