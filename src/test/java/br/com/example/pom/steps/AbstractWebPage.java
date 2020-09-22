package br.com.example.pom.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;

public class AbstractWebPage {

    private String path = Paths.get( "." ).toAbsolutePath().normalize().toString() + "\\src\\test\\resources\\ChromeDriver\\chromedriver.exe";

    WebDriver driver;

    WebDriver initDriver() {

        System.setProperty( "webdriver.chrome.driver", path );
        driver = new ChromeDriver();

        driver.get( "https://www.amazon.com" );
        //driver.manage().window().maximize();

        return driver;
    }






}
