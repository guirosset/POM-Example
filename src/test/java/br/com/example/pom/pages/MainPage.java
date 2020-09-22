package br.com.example.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement campoBusca;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement confirmaProduto;

    private static final String produto = "smartphone";

    public MainPage(WebDriver driver) {
        PageFactory.initElements( driver, this);
    }

    public void fazPesquisa() {
        campoBusca.sendKeys(produto);
        confirmaProduto.click();
    }

}
