package br.com.example.pom.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

class AbstractWebPage {

    private String path = Paths.get( "." ).toAbsolutePath().normalize().toString() + "\\src\\test\\resources\\ChromeDriver\\chromedriver.exe";

    WebDriver initDriver() {

        System.setProperty( "webdriver.chrome.driver", path );
        WebDriver driver = new ChromeDriver();

        driver.get( "https://www.magazineluiza.com.br/" );
        driver.manage().window().maximize();

        return driver;
    }
}
