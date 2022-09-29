package testejv.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import testejv.PageObject.swagCarrinhoPO;

public class swagCarrinho extends baseTest {

    private static swagCarrinhoPO loginPage;


    @BeforeClass
    public static void prepararTeste(){
        loginPage = new swagCarrinhoPO(driver);
    }

    @Test
    public void CT005_addProduto1(){
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        String resultado = loginPage.confirmar();
       assertTrue(resultado, resultado.contains("1"));
    }


    @Test
    public void CT006_addDoisProdutosAoCarrinho(){
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.addProduto2.click();
        String resultado = loginPage.confirmar();
       assertTrue(resultado, resultado.contains("2"));
    }

    @Test
    public void CT007_RemoverPodrutoDoCarrinho(){
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.addProduto2.click();
        loginPage.removerP1.click();
        String resultado = loginPage.confirmar();
       assertTrue(resultado, resultado.contains("1"));
    }


    @Test
    public void CT008_finalizarPedido(){
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.addProduto2.click();
        loginPage.conferir.click();
        loginPage.checkout.click();
        String pgfinal = loginPage.confirmação.getText();
        assertTrue(pgfinal, pgfinal.contains("YOUR INFORMATION"));
    }





}
