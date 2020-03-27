package br.com.example.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(how = How.XPATH, using = "//div[4]/div[2]/button[2]")
    private WebElement clicaCarrinho;

    public CartPage(WebDriver driver) {
        PageFactory.initElements( driver, this);
    }

    public void clicaCarrinho (){
        clicaCarrinho.click();
    }
}
