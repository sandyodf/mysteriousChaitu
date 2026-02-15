package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementUtils {
    private WebDriver driver;

    public WebElement getWebElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> getWebElements(By locator){
        return driver.findElements(locator);
    }

    public void enterText(By locator,String text){
        getWebElement(locator).sendKeys(text);
    }

    public void clickOn(By locator){
        getWebElement(locator).click();
    }


}
