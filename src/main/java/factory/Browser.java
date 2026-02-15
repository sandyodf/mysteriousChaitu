package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Browser {

    private WebDriver driver;
    Properties prop;


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

    public Properties initProp(){
        FileInputStream fp;
        prop = new Properties();
         try{
             fp = new FileInputStream("src/main/resources/config.properties");
             try {
                 prop.load(fp);
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
         return prop;
    }

}
