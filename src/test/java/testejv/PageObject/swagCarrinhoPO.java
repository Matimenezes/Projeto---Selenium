package testejv.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class swagCarrinhoPO extends basePO {
   
    @FindBy(name = "user-name")
    public WebElement campoUserName;

    @FindBy(name = "password")
    public WebElement campoPassword;
   
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement addProduto1;

     
   
    @FindBy(id="remove-sauce-labs-backpack")
    public WebElement removerP1;
    
    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addProduto2;

    @FindBy(id="checkout")
    public WebElement checkout;

    @FindBy(xpath =   "//span[@class='shopping_cart_badge']")
    public WebElement conferir;

    @FindBy(xpath =   "//span[@class='title']")
    public WebElement confirmação;

    public swagCarrinhoPO(WebDriver driver) {
        super(driver);
 }

 public void escreverUserName(String texto){
    campoUserName.sendKeys(texto);
}
public void escreverPassword(String texto){
    campoPassword.sendKeys (texto + Keys.ENTER);
}
public String confirmar(){
    return conferir.getText();
 }

 
  }

    

