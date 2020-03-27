package br.com.example.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ItemPage {

    private final static String elements = "//div[6]/div[2]/ul/li";

    @FindAll(@FindBy(how = How.XPATH, using = elements))
    private List<WebElement> items;

    private WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
    }

    /**
     *
     */
    public void selecionaPrimeiroProduto() {
        WebDriverWait wait = new WebDriverWait( driver, 10 );
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.xpath( elements ) ) );

        WebElement firstItem = items.get( 0 );

        firstItem.click();
    }
}
