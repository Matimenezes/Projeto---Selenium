package testejv.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class swagLoginPO extends basePO {

    @FindBy(name = "user-name")
    public WebElement campoUserName;

    @FindBy(name = "password")
    public WebElement campoPassword;

    @FindBy(id = "login-button")
    public WebElement buttonLogin;

    @FindBy(xpath =   "//div[@class='error-message-container error']")
    public WebElement enter;

    public swagLoginPO(WebDriver driver) {
        super(driver);
    }
    
public void escreverUserName(String texto){
    campoUserName.sendKeys(texto);
}
public void escreverPassword(String texto){
    campoPassword.sendKeys(texto);
}

public String avançar(){
   return enter.getText();
}




}