package testejv.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import testejv.PageObject.finalizarCompraPO;

public class finalizarCompra extends baseTest {

private static finalizarCompraPO loginPage;

@BeforeClass
public static void prepararTeste(){
    loginPage = new finalizarCompraPO(driver);
}


    @Test
    public void CT009_camposEmBranco(){

        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.conferir.click();
        loginPage.checkout.click();
        loginPage.escreverFirstName("");
        loginPage.escreverLasttName("");
        loginPage.escreverCEP("");
        loginPage.botãoContinue.click();
        String mensagem = loginPage.resultado.getText();
        assertTrue(mensagem, mensagem.contains("First Name is required"));
    }


    @Test
    public void CT010_camposLastNameEmBranco(){

        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.conferir.click();
        loginPage.checkout.click();
        loginPage.escreverFirstName("mateus");
        loginPage.escreverLasttName("");
        loginPage.escreverCEP("064");
        loginPage.botãoContinue.click();
        String mensagem = loginPage.resultado.getText();
        assertTrue(mensagem, mensagem.contains("Last Name is required"));
    }

    @Test
    public void CT011_camposCepEmBranco(){

        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.conferir.click();
        loginPage.checkout.click();
        loginPage.escreverFirstName("mateus");
        loginPage.escreverLasttName("martins");
        loginPage.escreverCEP("");
        loginPage.botãoContinue.click();
        String mensagem = loginPage.resultado.getText();
        assertTrue(mensagem, mensagem.contains("Postal Code is required"));
    }

    @Test
    public void CT011_CompraFinalizadaComSucesso(){

        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");  
        loginPage.addProduto1.click();
        loginPage.conferir.click();
        loginPage.checkout.click();
        loginPage.escreverFirstName("mateus");
        loginPage.escreverLasttName("martins");
        loginPage.escreverCEP("06417");
        loginPage.botãoContinue.click();
        loginPage.botãoFinish.click();
        String ultimaMsgm = loginPage.mensagemFinal.getText();
        assertTrue(ultimaMsgm, ultimaMsgm.contains("THANK YOU FOR YOUR ORDER"));


    }









    
}
