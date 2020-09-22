package br.com.example.pom.methods;

import br.com.example.pom.steps.AbstractWebPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public class SeleniumMethods {

    @Autowired
    private WebDriver driver;

    public void waituntil(WebElement elementToAppear) {
        WebDriverWait wait = new WebDriverWait(driver, 75000);
        wait.until( ExpectedConditions.visibilityOf(elementToAppear));
    }

    public void scrollToElement(WebElement element) {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {

        }
    }
}