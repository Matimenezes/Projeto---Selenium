package testejv.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import testejv.PageObject.swagLoginPO;


public class swagTest extends baseTest {
    
    private static swagLoginPO loginPage;

    @BeforeClass
    public static void prepararTeste(){
        loginPage = new swagLoginPO(driver);
  }

    @Test
    public void CTOO1_loginCorreto(){
      
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("secret_sauce");
        loginPage.buttonLogin.click();  
    }

    @Test
    public void CTOO2_loginIncorreto(){
      
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("1234");
        loginPage.buttonLogin.click(); 
       String resultado = loginPage.avançar();
       assertTrue(resultado, resultado.contains("Username and password do not match any user in this service"));

    }
    @Test
    public void CTOO3_erroAoNãoPreencherNenhumCampo(){
      
        loginPage.escreverUserName("");
        loginPage.escreverPassword("");
        loginPage.buttonLogin.click(); 
       String resultado = loginPage.avançar();
       assertTrue(resultado, resultado.contains(" Username is required"));

    }

    @Test
    public void CTOO4_erroAoPreencherApenasUserName(){
      
        loginPage.escreverUserName("standard_user");
        loginPage.escreverPassword("");
        loginPage.buttonLogin.click(); 
       String resultado = loginPage.avançar();
       assertTrue(resultado, resultado.contains("Password is required"));

    }

    
}
