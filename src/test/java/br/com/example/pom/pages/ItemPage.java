package br.com.example.pom.pages;

import br.com.example.pom.methods.SeleniumMethods;
import org.junit.Assert;
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

public class ItemPage extends SeleniumMethods {

    @FindBy(how = How.XPATH, using = "//div[@data-index='2']//h2")
    private WebElement item;

    private WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
    }

    /**
     *
     */
    public void selecionaPrimeiroProduto() {
        //WebDriverWait wait = new WebDriverWait( driver, 10 );
        WebDriverWait wait = new WebDriverWait(driver, 10  );
        wait.until( ExpectedConditions.visibilityOf( item ) );


        //waituntil( item );

        Assert.assertTrue( "O elemento está presente", item.isDisplayed() );
        item.click();
    }
}
