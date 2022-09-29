package testejv.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class finalizarCompraPO extends basePO {

    @FindBy(name = "user-name")
    public WebElement campoUserName;

    @FindBy(name = "password")
    public WebElement campoPassword;

    @FindBy(id="first-name")
    public WebElement Firstname;

    @FindBy(id="last-name")
    public WebElement Lastname;

    @FindBy(id="continue")
    public WebElement botãoContinue;

    @FindBy(id="finish")
    public WebElement botãoFinish;

    @FindBy(id="postal-code")
    public WebElement cep; 
   
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement addProduto1;

    @FindBy(id="checkout")
    public WebElement checkout;

    @FindBy(xpath =   "//span[@class='shopping_cart_badge']")
    public WebElement conferir;

    @FindBy(xpath =   "//span[@class='title']")
    public WebElement confirmação;

    @FindBy(xpath =   "//div[@class='error-message-container error']")
    public WebElement resultado;

    @FindBy(xpath =   "//h2[@class='complete-header']")
    public WebElement mensagemFinal;

    public finalizarCompraPO(WebDriver driver) {
        super(driver);
       
    }

    public void escreverUserName(String texto){
        campoUserName.sendKeys(texto);
    }
    public void escreverPassword(String texto){
        campoPassword.sendKeys (texto + Keys.ENTER);
    }
    
    public void escreverFirstName(String texto){
        Firstname.sendKeys(texto);
      }
     
      public void escreverLasttName(String texto){
         Lastname.sendKeys(texto);
       }
      
       public void escreverCEP(String texto){
        cep.sendKeys(texto);
       }
}
