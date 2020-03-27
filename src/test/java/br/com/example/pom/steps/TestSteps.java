package br.com.example.pom.steps;

import br.com.example.pom.pages.CartPage;
import br.com.example.pom.pages.ItemPage;
import br.com.example.pom.pages.MainPage;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class TestSteps {

    private WebDriver driver;

    /**
     *
     */
    @BeforeStories
    public void initDriver(){
        AbstractWebPage init = new AbstractWebPage();
        this.driver = init.initDriver();
    }

    @Given("O Script acessa a URL")
    public void scriptAcessaUrl() {
        MainPage mainPage = new MainPage(driver);
        mainPage.fazPesquisa();
    }

    @When("O usuario seleciona um produto")
    public void selecionaProduto() {
        ItemPage itemPage = new ItemPage(driver);
        itemPage.selecionaPrimeiroProduto();
    }


    @Then("O usuario finaliza compra")
    public void finalizaCompra() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clicaCarrinho();
    }

    @AfterScenario
    public void fechaDrive(){
        driver.close();
        driver.quit();
    }
}